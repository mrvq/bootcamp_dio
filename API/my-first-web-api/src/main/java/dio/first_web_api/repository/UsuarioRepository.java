package dio.first_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.first_web_api.model.Usuario;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null)
            System.out.println("Save: Recendo o usuário na camada de repositorio");
        else
            System.out.println("Update: Recebendo o usuário na camada de repositorio");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/ID - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuário do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("marcio", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
        return new Usuario("gleyson", "password");

    }

    public Usuario findByUsername(String username) {
        System.out
                .println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("gleyson", "password");
    }
}
