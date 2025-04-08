package br.com.dio;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.dio.ui.custom.screen.MainScreen;

public class UIMain {

    public static void main(String[] args) {

        final var gameConfig = Stream.of(args)
                .filter(arg -> arg.contains(";") && arg.split(";").length == 2)
                .collect(Collectors.toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]));
        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();

    }
}