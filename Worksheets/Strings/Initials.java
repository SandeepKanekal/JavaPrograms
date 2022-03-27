package Worksheets.Strings;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Initials {
    public String nameWithInitials(@NotNull String name) {  // don't mind @NotNull
        String LastName = name.substring(name.lastIndexOf(' ') + 1);  // getting the last name
        name = name.substring(0, name.lastIndexOf(' '));  // getting the first names (ex: "FirstName MiddleName " from "FirstName MiddleName LastName"
        name = " " + name;
        StringBuilder InitialName = new StringBuilder();
        for (int index = 0; index < name.length(); index++) {
            if (name.charAt(index) == ' ')  // if the character is a space, the character next to the space is taken
                InitialName.append(name.charAt(index + 1)).append(" ");
        }
        InitialName.append(LastName);  // appending the last name
        return InitialName.toString();  // returning string value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        name = name.toUpperCase();
        Initials ob = new Initials();
        String InitialName = ob.nameWithInitials(name);
        System.out.println(InitialName);
        sc.close();
    }
}
