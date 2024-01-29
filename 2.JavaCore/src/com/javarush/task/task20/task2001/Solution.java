package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* 
Читаем и пишем в файл: Human
*/

public class Solution {
    public static void main(String[] args) {
        try {
            File your_file_name = File.createTempFile("your_file_name", null);

            try (OutputStream outputStream = new FileOutputStream(your_file_name);
                 InputStream inputStream = new FileInputStream(your_file_name)) {

                Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
                ivanov.save(outputStream);
                outputStream.flush();

                Human somePerson = new Human();
                somePerson.load(inputStream);

                System.out.println(somePerson.equals(ivanov));
            }
        } catch (IOException e) {
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (!Objects.equals(name, human.name)) return false;
            return Objects.equals(assets, human.assets);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter writer = new PrintWriter(outputStream)) {
                if (!this.name.isEmpty()) {
                    writer.println(this.name);
                }
                if (!this.assets.isEmpty()) {
                    for (Asset asset : this.assets) {
                        writer.println(asset.getName());
                        writer.println(asset.getPrice());
                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            while (reader.ready()) {
                String assetsName = reader.readLine();
                double assetsPrice = Double.parseDouble(reader.readLine());
                this.assets.add(new Asset(assetsName, assetsPrice));
            }
            reader.close();
        }
    }
}
