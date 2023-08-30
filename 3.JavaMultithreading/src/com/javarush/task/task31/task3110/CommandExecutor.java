package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import static com.javarush.task.task31.task3110.Operation.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommandExecutor {

    private static final Map<Operation, Command> ALL_KNOWN_COMMANDS_MAP = new HashMap<>();

    static {
        ALL_KNOWN_COMMANDS_MAP.put(CREATE, new ZipCreateCommand());
        ALL_KNOWN_COMMANDS_MAP.put(ADD, new ZipAddCommand());
        ALL_KNOWN_COMMANDS_MAP.put(REMOVE, new ZipRemoveCommand());
        ALL_KNOWN_COMMANDS_MAP.put(EXTRACT, new ZipExtractCommand());
        ALL_KNOWN_COMMANDS_MAP.put(CONTENT, new ZipContentCommand());
        ALL_KNOWN_COMMANDS_MAP.put(EXIT, new ExitCommand());
    }

    public static void execute(Operation operation) throws Exception {
        ALL_KNOWN_COMMANDS_MAP.get(operation).execute();
    }
}