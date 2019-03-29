package com.company;

public class Logo {
        public void printLogo(String logo) throws InterruptedException {

            char [] pixels =logo.toCharArray();
            for (int i = 0; i <pixels.length ; i++) {
                Thread.sleep(2);
                System.out.printf(String.valueOf(pixels[i]));
            }
        }
        public String bitcoinLogo; // rozmiar 80 https://www.ascii-art-generator.org/
        {
            bitcoinLogo = "--------------------------------------------------------------------------------\n"+
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXXXXXXNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMWNKkdl:,'.......'';:ldkKWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMN0dc'.                    .,cxKWMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMW0o,.      ....   .....          .;dKWMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMNO:.        .kXXk' .dXXXx.            .cOWMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMWO:.          '0WWK, .kMWWO.              .:0WMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMXl.            '0MM0, .kMMWO.                .oXMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMW0,       ,ooooooxNMWNOdxXMMMXdc:,..             ;KMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMWO'        dMMMMMMMMMMMMMMMMMMWWMMWXOo'            ,0MMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMW0'         'cclkXMWMMMNOddddxkKNWMMMMMXc            ;KMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMX:              .xMMMMM0,      .,kWMMMMWK,            cNMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMx.              .xMMMMM0,        '0MMWWMK;            .kMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMN:               .xMMMMMK,       .oNMMMMNd.             cNMMMMMMMMMMM\n" +
                    "MMMMMMMMMMM0'               .xMMMMMXxclllodkKWMMMW0c.              ,KMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMO.               .xMMMWMMMWMMMMMMWWMMMWXkl'             '0MMMMMMMMMMM\n" +
                    "MMMMMMMMMMMO.               .xMMMMMXxccccllox0NMMMMMWXl.           '0MMMMMMMMMMM\n" +
                    "MMMMMMMMMMMK,               .xMMMMMK,         ;OWMMMMWNc           ;KMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMWl               .xMMMMMK,          :XWWMMMWo           lNWMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMO.              .xMMMMM0,         .xWMMWMMN:          'OWWMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMWo          .;ccoKMMMMMXo;;;;::lokXWMMMMMNo.         .oXWMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMXc         :XWWMWMMMMMWWWWMMMMMMMWMMMMNO:.          cKWMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMXc        c00000KXWWMWNXNWMMMWXK0Oxoc'            c0NMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMNd.       ......;KMWKc.;OMMM0;..               .oKWMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMW0;            '0WWK, .kMMWO.                ;kXWMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMNx;          '0WWK, .kMWWO.             .,xXNWMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMNk:.       .;cc;.  ,ccc;            .:kXWWWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMWKd:.                          .:dKWWWMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMWXOo:,..              ..,coOXWMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kxdollccllodxO0XWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "--------------------------------------------------------------------------------\n";
        }

        public String dogeCoin;

        {
            dogeCoin = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX00KWMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMWX0OO0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOxxkOXMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMW0dlllokKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMXxodkOOKWMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMWKdlllodxxOKWMMMMMMMMMMMMMMMMMMMMMMMMMNkoodkOk0WMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMWOllloddddxxkKNMMMMMMMMMMMMMMMMMMMMMWNOdoodxOkOWMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMXxllcclloodxdox0NWWNNNNWWWWMMMMMMWWWXkddoodxkkkXMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMKdlc::::ccloollodxkkxkkkOO00KKK000OOkxkkkxxxxxkKWMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMKdlc:,'',,,:lolclodxxxxkkkkkkxxxxkkkxkkOOOOOkxkOXMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMXxllc;'',:c:lol:clodxxxkkkkkkxxxxxxxkkOOOO00OOkkOKNNWWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMWOllc:;'';looolcldxxxxxkkkkkkkkkxxxxxkkOO0KK00OOO000000KNMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMW0olool:,',:looodxkkkkkkkkkkOOOOkkxddxkkO0KK0000O00000OkOKWMMMMMMMMMMMM\n" +
                    "MMMMMMMMWXkdddddoc;,:ldxxkkkkkkkkkkOOOOOOOOkxddxkkO000000000000000k0NMMMMMMMMMMM\n" +
                    "MMMMMMMMNOxdddddoolodxkkkkkkkkkkkkkkkOOOOOOOkdddxkkO00OOxddxO000000k0NMMMMMMMMMM\n" +
                    "MMMMMMMNOxdlcclodxxkkkkkkkkkkkkkkxxxkkOOOOOOOkxddxkkkOOxc,:odk0KKKK0k0WMMMMMMMMM\n" +
                    "MMMMMMW0xxdl::cdxkkkkkkkkkkkkkkkkxdllooodxOOkkkkxxOOOOkd;.'lxx0XNNXK0OXMMMMMMMMM\n" +
                    "MMMMMMNkdxdlcldxxkkkkkkkkOkkkkkxl;..'coolccodxkOkkO00OOko;,cok0KXNNNKO0WMMMMMMMM\n" +
                    "MMMMMMXxxxddddxkOOOOOOOOOO00OOkxl'....cOKx,'cdxOOO000000OOkkO000KNNNNK0NMMMMMMMM\n" +
                    "MMMMMWKxxxxxxxk000000KK0KKK000Okkdc;,;okkdccodxOO00000000000000KXNNNNNXNMMMMMMMM\n" +
                    "MMMMMNOxxxxxxxO000000KKKK000K00OOOkkxxxxxxkkkkOOO00000000OxddodkKNNNNNNNWMMMMMMM\n" +
                    "MMMMWKkxkkxxxxO0000000KKK000KK00000OOOOOOOOOO000000000kl;'......,xXNNNNNWWWWWWWW\n" +
                    "MMMMXkxxxxxddk00000000000KK0000KKKK000000000000000000Ol..........;ONNNNNNWMMMMMM\n" +
                    "MMMW0xxxxxxdxO0000000000000KKK0KKK00KK000000000000OO0Oo;.........,xXNNNNNWWWWMMM\n" +
                    "MMMXkxxxkxxdxO000000000000KKKKKK0K00000000000OOOO0OOOOxo:'.......;oKXXXXXNWWWWWM\n" +
                    "MMWKkxxxxxxddk0000KKKKKKKK000KKK0K00000000K0OkkOOOOOOOOkl,.....';;l0XXNNNNWWWMMM\n" +
                    "MMXOxxxxxxxxdxk000KKKKKKKK0000KKKKKKKKKK0000OkkkkkOOOOOxl,',,,,,;cxKXXNNNWWWWWWM\n" +
                    "MNOxxxxxdxxxxdxO0000KKKKKKKKKK0000000000000OxddxxkkOOOxl,''''''';xXXXXNNNWMMMMMM\n" +
                    "WKkxxxxxddxxxddxO000KKKKKKKKKKKKKK00000000Odc:;;:clooc:,,,;;;;::o0XXXXXNWMMMMMMM\n" +
                    "NOxkxxdddddxxxddxO00000KKKKKKKKKKKK00000000Odllccccccccccc:::cok0XXXXXXNWMMMMMMM\n" +
                    "XkxxxxdddddddddddxO000000KKKKKKKKKK000000000Okxxxxxxdxxxdooodk0KKKXXXXNWMMMMMMMM\n" +
                    "Kkxxxdddddodddddddxk00000KKKKKKKKKK000000000000000OOOOOOOOOO00KKKKXXXNWMMMMMMMMM\n" +
                    "KkkxxddddollooddddxxkO0000KKKKKKKKKKKKKK00000000000000000000KKKKKKXXKXWMMMMMMMMM\n" +
                    "KkxkxxxxxdolllloddxkOO0000000KKKKKKKKKKKKK000000KKKK00000KKKKKXKKKK00KNMMMMMMMMM\n" +
                    "KxxkkkkxxxdolllooddxO000KK0OkO0KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0OOOO00XWMMMMMMMM\n" +
                    "OdxOOOOkkkkxdlloddkO00000K00OkkkOO0KKKKXXKKKXKKKKKKXXKKKKKKXK0OkkkO000XWMMMMMMMM\n" +
                    "kdxkOO0OOOOOkxdoddkO0000000000OOkxxkkOO000000KKKKKKXXKKKKK00OkkkOO0000XWMMMMMMMM\n" +
                    "xddkOOOO00000OOkkxkkO00000000000OOkkxxxxxxxxkkkkkOOOOOOOkkkkkOO0000000KNMMMMMMMM\n" +
                    "xddxO0000000000000OOOOOOOOO0OOO00OOOOOkkkkkxxxxxxxxxxxkkkkkO0000000000KNMMMMMMMM\n" +
                    "xddxO0O00000000000000OOOOOO0OOOOO000OO0OOOOOkkxxxxxxkkkkkkO0K0000000000XWMMMMMMM\n" +
                    "ddddkOO0000000000000000OOOOOOOOOOO0OOO000000OOkxxxxkkkkkxk0000000000000KNMMMMMMM\n" +
                    "dddddkO0000000000K00000OOOOOOOOOOOOOOOO000OO0OOkkxxxkxxxxk0000000000000KXWMMMMMM\n" +
                    "--------------------------------------------------------------------------------\n";
        }
        public String ethereum ;
        {ethereum="MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0doOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOo;.,xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOdl;..'dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXkool;...'lKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxoool;.....c0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0dooool;......;OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOdoooool;.......,xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkdooooooc,........'oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMWXkooolc:;,'.  ........lKMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMWKdlc:;,'.....       ....:0WMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMW0l,'..........           .:KMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMXOxc,.........        ..:dkXMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMWX000xo;'.....     .,ldxxx0WMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMWKkxO00kdc,..  .;oxxdc,c0WMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMXOdodk00Oxoodxxo;'.,dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0xooodxOxoc,....:OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkdoool;.....'lKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0dool;....;kNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxol;..'c0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOo;.,dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0xdOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                "--------------------------------------------------------------------------------\n";
    }
        public String litecoin ="                                 ...',,,,,,'...                                 \n" +
                "                           .,coxOKXXNWWWWWWNXXKOxoc,.                           \n" +
                "                       .,lkKNMMMWNK0OOkkkkOO0KNWMMMNKkl,.                       \n" +
                "                     ;d0NWMWKkoc;'..        ..';cokKWMWN0d,                     \n" +
                "                  .cONMMNOo;.                      .;oONMWNOc.                  \n" +
                "                .c0WWW0o,          .,,,,,,,,,,,.       ,oKWMW0c.                \n" +
                "               ;OWMW0c.           .kWWWWWWWWWWX:         .c0WMWO;               \n" +
                "             .oXMMXl.             lNMMMMMMMMMWd.           .oXMMXo.             \n" +
                "            .xNMWO,              ,KMMMMMMMMMW0'              ;OWMNx.            \n" +
                "           .xWMWx.              .xWMMMMMMWWMNc                .kWWWx.           \n" +
                "           oWMWx.               cNMMMMMMMMMWx. .               .kWWWo           \n" +
                "          :XMMO'               '0MMMMMMMMMMNxlkk,               ,KMMX:          \n" +
                "         .xWMNc               .dWMMMMMMMMMWMWWWd.                lWMMx.         \n" +
                "         ,KWWO.               cXMMMMMMMMMMMMWXx.                 ,0MMK;         \n" +
                "         cNMMx.           'ldONMMMMMMMMMMXkl;'.                  .kMMNc         \n" +
                "         lWMMo           ,KMWMWMMMMMMMMWNo                       .xWMWl         \n" +
                "         lWMMd          .xWNWMMMMMMWMMMk:.                       .xWMWc         \n" +
                "         :NWWk.         .c:c0WMMMMMMMMX;                         .OMMX:         \n" +
                "         'OMMK,            lNMMMMMMMWWo                          :XMM0'         \n" +
                "          oWMWd.          ;KMMWMMMMMMNOddddddddddddddddd,       .xMMWo          \n" +
                "          'OMMXc         .xWMMMMMMMMMMMMMMMMMMMMMMMMMWMK,       lNMMO.          \n" +
                "           ;KMMK;        cNMMMMMMMMMMMMMMMMMMMMMMMMMMMNl       cXWMK;           \n" +
                "            :KWMKc      '0MMMMMMMMMMMMMMMMMMMMMMMMMMMWk.     .lXMWK:            \n" +
                "             ;0MMNx.    ;xxxxxxxxxxxxxxxxxxxxxxxxxxdxd'     'xNMM0;             \n" +
                "              'xNWW0c.                                    .lKWMNx'              \n" +
                "               .:0WWW0c.                                .l0WWW0:                \n" +
                "                 .c0WWWKx:.                          .:xXWWW0c.                 \n" +
                "                   .:kXWMWXkl;..                ..;lkKWMWXx:.                   \n" +
                "                      'ckKWMMWX0kdlc:;;;;;;:cldk0XWMMWKkc'                      \n" +
                "                         .;lx0XWMMMMMMMMMMMMMMMMWX0xl;.                         \n" +
                "                             ..,:codxxxxxxxxdoc:,..                             \n" +
                "--------------------------------------------------------------------------------\n";



}


