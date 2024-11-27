
### ВСЕ РЕЗУЛЬТАТЫ:");
        game.printAllResults();
        printDelimiter();
        System.out.println("\n\nСПОРТСМЕНЫ С ТАКИМ ЖЕ ИТОГОВЫМ ВРЕМЕНЕМ, КАК У КОНТРОЛЬНОГО СПОРТСМЕНА:");
        game.printSportsmanWithEqualTime();
        printDelimiter();
    }

    private static void printDelimiter() {
        System.out.println("=================================================================================================");
    }
}