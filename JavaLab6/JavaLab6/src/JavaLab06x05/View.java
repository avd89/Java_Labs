/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x05;

/**
 * there are the output methods of the program that emulate game "Guess the number"
 * 29.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * 
 */
public class View {

    public static void PrintEndPhrase() {
        System.out.println("       ::::::::      :::       :::   :::   ::::::::::          ::::::::  :::     ::: :::::::::: ::::::::: ");
        System.out.println("    :+:    :+:   :+: :+:    :+:+: :+:+:  :+:                :+:    :+: :+:     :+: :+:        :+:    :+: ");
        System.out.println("   +:+         +:+   +:+  +:+ +:+:+ +:+ +:+                +:+    +:+ +:+     +:+ +:+        +:+    +:+  ");
        System.out.println("  :#:        +#++:++#++: +#+  +:+  +#+ +#++:++#           +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:");
        System.out.println(" +#+   +#+# +#+     +#+ +#+       +#+ +#+                +#+    +#+  +#+   +#+  +#+        +#+    +#+");
        System.out.println("#+#    #+# #+#     #+# #+#       #+# #+#                #+#    #+#   #+#+#+#   #+#        #+#    #+#  ");
        System.out.println("########  ###     ### ###       ### ##########          ########      ###     ########## ###    ###");
    }

    public static void PrintWinPhrase() {
        System.out.println("    :::       ::: ::::::::::: ::::    ::: ");
        System.out.println("   :+:       :+:     :+:     :+:+:   :+:  ");
        System.out.println("  +:+       +:+     +:+     :+:+:+  +:+   ");
        System.out.println(" +#+  +:+  +#+     +#+     +#+ +:+ +#+    ");
        System.out.println("+#+ +#+#+ +#+     +#+     +#+  +#+#+#     ");
        System.out.println("#+#+# #+#+#      #+#     #+#   #+#+#      ");
        System.out.println("###   ###   ########### ###    ####       ");
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

}
    

