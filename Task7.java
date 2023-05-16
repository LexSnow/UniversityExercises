package com.lex;

public class Task7 {


    public static void main(String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));

        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));

        System.out.println(tr("November 2016",
                "abcdefghijklmnopqrstuvwyz",
                "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }

    public static String norm(String name){
        String[] chars = disassemble(name);
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0].toUpperCase());
        for(int i = 1; i < chars.length; i++){
            sb.append(chars[i].toLowerCase());
        }
        return sb.toString();
    }

    public static String init(String name){
        String[] splitted = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < splitted.length - 1; i++){
            sb.append(disassemble(splitted[i])[0].toUpperCase())
                    .append(". ");
        }
        sb.append(norm(splitted[splitted.length - 1]));
        return sb.toString();
    }

    public static String tr(String s, String from, String to){
        String[] fromArray = disassemble(from);
        String[] toArray = disassemble(to);
        if(fromArray.length != toArray.length){
            throw new IllegalArgumentException("The \"from\" and \"to\" arguments need to be of the same size");
        }
        for(int i = 0; i < fromArray.length; i++){
            if(s.contains(fromArray[i])){
                s = s.replace(fromArray[i], toArray[i]);
            }
        }
        return s;
    }

    private static String[] disassemble(String string){
        String[] charsToString = new String[string.toCharArray().length];
        for(int i = 0; i < string.length(); i++){
            charsToString[i] = String.valueOf(string.toCharArray()[i]);
        }
        return charsToString;
    }
}