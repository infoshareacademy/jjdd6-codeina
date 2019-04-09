package com.infoshareacademy.jjdd6;

public class Logo {
    public void printLogo(String logo) throws InterruptedException {

        char[] pixels = logo.toCharArray();
        for (int i = 0; i < pixels.length; i++) {
            Thread.sleep(1);
            System.out.printf(String.valueOf(pixels[i]));
        }
    }

    public String bitcoinLogo; // rozmiar 80 https://www.ascii-art-generator.org/

    {
        bitcoinLogo = "--------------------------------------------------------------------------------\n" +
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

    public String dogeCoinLogo;

    {
        dogeCoinLogo = "--------------------------------------------------------------------------------\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX00KWMMMMMMMMMMMMMMMMMMMMMMMM\n" +
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

    public String ethereumLogo;

    {
        ethereumLogo = "--------------------------------------------------------------------------------\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
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

    public String litecoinLogo =
            "--------------------------------------------------------------------------------\n" +
                    "                                 ...',,,,,,'...                                 \n" +
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

    public String bitcoinCashLogo =
            "--------------------------------------------------------------------------------\n" +
                    "                   'o0WMMMMWXOdc;..          ..;cdOXWMMMMWKo'                   \n" +
                    "                 'dXWMMMW0d:.                      .:d0WMMMWXd'                 \n" +
                    "               .oXMMMMXx;.                            .;xXMMMMXo.               \n" +
                    "              ;0WMMMNx'                                  'xNMMMW0;              \n" +
                    "             cXMMMWO;           ..  ;o:.                   ;OWMMMXc             \n" +
                    "            lNMMMNd.           c0k'.dWX;                    .dNMMMNl            \n" +
                    "           cXMMMNo.            :XWd'oNW0dooooc,.             .oNMMMXc           \n" +
                    "          ,0MMMWd.         ..,:dXMWXNWMWWWMMMMNk'             .dWMMM0,          \n" +
                    "         .dWMMMO'         .xXNWMMMMXxc:;;:l0WMMWd.             'OMMMWd.         \n" +
                    "         '0MMMNl           ,c:l0MMMK,      cNMMNo               lNMMM0'         \n" +
                    "         :NMMMK,               cNMMWd. ..'l0WMMXd;.             ,KMMMN:         \n" +
                    "         lWMMMO.               .kMMMNOOKXNWWWMMMMWKc.           .OMMMWl         \n" +
                    "         lWMMMO.                cXMMMXxlcc;;;ckWMMMX:           .OMMMWl         \n" +
                    "         cNMMM0'                .kMMMK,       '0MMMWo           '0MMMNc         \n" +
                    "         ,KMMMNc                 cNMMWd.    .,xNMMM0,           cNMMMK,         \n" +
                    "         .xWMMMk.                .OMMMKoclokKNMMN0o'           .kMMMWx.         \n" +
                    "          ;KMMMNo              .cxXMMMMMMWWWMNxc,.             oNMMMK;          \n" +
                    "           lNMMMXc             :XNK0OKMNKo;kWX;               cXMMMNl           \n" +
                    "           .dNMMMXl.           .''.  :XWNo ,0Xo.            .lXMMMNd.           \n" +
                    "            .oNMMMNx'                .okxc. .'.            'xNMMMNo.            \n" +
                    "             .cKMMMWKl.                                  .lKWMMMKc.             \n" +
                    "               'kNMMMWKo'                              'oKWMMMNx'               \n" +
                    "                .;ONMMMMXkc'.                      .'ckXMMMMNO;.                \n" +
                    "                  .;xXWMMMWN0dc;..            ..,cd0NWMMMWXx;.                  \n" +
                    "--------------------------------------------------------------------------------\n";
    public String decredLogo =
            "--------------------------------------------------------------------------------\n" +
                    "             .                      ............. ...                           \n" +
                    "       ..,,,,,,,,;,;;,..           .':llllllllllllooolllc:;'..                  \n" +
                    "        ..,::cccccccccc:'.           .;oxkkkkkkkkkOOOOOOOOOkxo:,.               \n" +
                    "           .';:cccccccccc:,..          ..,lxOkkkkkOOOOOOOOOOOOOkd:..            \n" +
                    "             .';:ccccccccccc;'.           .'cxkkkkkOOOOOOOOOOOOOOOxc.           \n" +
                    "               ..,:ccccccclllc:'.            .:oddddddxkOOOOOOOOOOOOx;.         \n" +
                    "                 .':ccccccllllllc,..           ........',:okOOOOOOOOOk:.        \n" +
                    "              ..',:cccccccllllllllc;..                    .'ckOOOOOOOOk:.       \n" +
                    "            ..,:cccccccccclllllllllll:'..                   .,dOOOOOOO0x,       \n" +
                    "           .,:cccccccccccllllllllllllllc:,..                  ,xOOOOOOOOc.      \n" +
                    "         .':c:ccccccccc::;;;;;;;;;;;;;;;;;;..                 .lOOOOOOO0d.      \n" +
                    "        .,:::ccccccc:,....                                    .:OOOOOOO0d.      \n" +
                    "       .'::::ccccc:'.                                         .oOOOOOOO0o.      \n" +
                    "       .;::::cccc;.                                          .:kOOOOOOOO:.      \n" +
                    "      .,:::cc:cc;.                                          .ckOOOOOOO0d.       \n" +
                    "      .,::::::cc,.                                       ..:dOOOOOOOOOx,        \n" +
                    "      .,::::::cc,.                 ..''''''''''''''''',;coxOOOOOOOOOOx,.        \n" +
                    "      .,:::::ccc;.                 ..:dkkkkkkkkkkkkkkkOOOOOOOOOOOOOOl.          \n" +
                    "       .:::::ccc:,.                   .;lokkkkkkkkOOOOOOOOOOOOOOOko,.           \n" +
                    "       .,:::ccccc:,.                     .,lxkkkkkOOOOOOOOOOOOkdc'.             \n" +
                    "        .;::::ccccc:,...                   .'cxkkkOOOOOOOOOOxc'.                \n" +
                    "         .,:cccccccccc:;,''''''''.           ..:dkOOOOOOOOOOxl,.                \n" +
                    "          .';ccccccccccccllllllllc,..           .;okOOOOOOOOOOko;.              \n" +
                    "            .':ccccccccccclllllllllc;..           .'cxOOOOOOOOOOOd:.            \n" +
                    "              ..,:ccccccccllllllllllll:'..          ..:dOOOOOOOOOOOkl'.         \n" +
                    "                 ..',;:ccccllllllllllllllc,..          .;okOOOOOOOOOOko;.       \n" +
                    "                     .................''..'..            .',,,,,,,,,,,,,.       \n" +
                    "--------------------------------------------------------------------------------\n";


    public String zCashLogo =
            "--------------------------------------------------------------------------------\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMWXOxoc;'..            ..';:lxOKNMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMN0dc,.                            .,cd0NMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMWXkc'.                                    .'cxXWMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMXkc.                                            .:kXWMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMWKo'              ..,:clloddddddoolc:,'.              'oKWMMMMMMMMMMM\n" +
                    "MMMMMMMMMW0l.           ..;coxkO0000000000000KKK00kxl:'.           .c0WMMMMMMMMM\n" +
                    "MMMMMMMMXo.          .,cdkOOOOOOOOkdlllllllld00000KKKK0xl,.          .lKMMMMMMMM\n" +
                    "MMMMMMNk'          'cdkOOOOOOOOOOOx'        ,k000000KKKKK0kl'          'xNMMMMMM\n" +
                    "MMMMMXl.         'lxkkkkOOOOOOOOOOd.        ,k0000000KKKKKKK0d,         .cKMMMMM\n" +
                    "MMMW0;         .lxkkkkkkkkkkkkkkkkd.        ,xOOOOOOOO000KKKKK0d'         ;0WMMM\n" +
                    "MMW0,        .:dkkkkkkkkko,........          .........:kK0KKKKKKOc.        'OWMM\n" +
                    "MM0,        .lxkkkkkkkkkkc.                           .d0000KKKKK0d.        'OMM\n" +
                    "MK;        .lxxxxkkkkkkkkc.                           .d000000KKKKKx'        ;KM\n" +
                    "Nl        .lxxxxxxxxkkkkkc.                           'x00000000KKKKx.        lN\n" +
                    "O.       .cxxxxxxxxxxkkkkl'..............            'dO0000000000KK0o.       .k\n" +
                    "c        ,dxxxxxxxxxxxxkkxxddxdxxxxxxxdc,.         .:x0000000000000KKO:        :\n" +
                    "'       .cxxxxxxxxxxxxxxxxkkkkkkkkkkko,           .lOOO00000000000000Kd.       .\n" +
                    "        'oxdxxxxxxxxxxxxxxxkkkkkkkkx:.           ;dOOOOOO0000000000000k,        \n" +
                    "        ,ddddxxxxxxxxxxxxxxxxkkkkxo'           .ckOOOOOOOOO00000000000O:        \n" +
                    "        ;ddddddxxxxxxxxxxxxxxxxkx:.           ,okOOOOOOOOOOOO0000000000c        \n" +
                    "        ,dddddddddxxxxxxxxxxxxxo,           .:xkkkOOOOOOOOOOOOOOO00000O:        \n" +
                    "        'oddddddddddxxxxxxxxxdc.           'okkkkkkOOOOOOOOOOOOOOO0000k;        \n" +
                    ".       .ldddddddddddxxxxxxxo,           .:dkkkkkkkkkOOOOOOOOOOOOOO000x.       .\n" +
                    ";        ;oddddddddddddxxxdc.          ,:oxkkkkkkkkkkkOOOOOOOOOOOOOOOOc        ,\n" +
                    "d.       .cddddddddddddddo;.          .,;;;;;;;;;;;;:::okOOOOOOOOOOOOd.        o\n" +
                    "K;        'lddddddddddddl.                             ,xkkkOOOOOOOOx,        ,K\n" +
                    "Wk.        ,lddddddddddd;                              ,xkkkkOOOOOOx;        .xW\n" +
                    "MNo.        'ldodddddddd,                              ,xkkkkkkOkOx,        .oNM\n" +
                    "MMNl.        .codddddddo;                              ;xkkkkkkkko'         lXMM\n" +
                    "MMMNo.        .,loddddddl:::::::::,.        .;c::ccccccoxkkkkkkd:.        .lNMMM\n" +
                    "MMMMNx.         .;loddddddddddddddl.        'dxxxxxxxkkkkkkkkdc.         .dNMMMM\n" +
                    "MMMMMWO;          .;coddddddddddddl.        'oxxxxxxxxxxkkxo:.          ,OWMMMMM\n" +
                    "MMMMMMMXd.          .':lodddddddddo;'....''':dxxxxxxxxxxoc'.          .oXMMMMMMM\n" +
                    "MMMMMMMMWKl.           ..,:loddddddddddddddddxxxxxxdoc;'.           .c0WMMMMMMMM\n" +
                    "MMMMMMMMMMW0l.             ..',:cllooodddddooolc:;'..             .l0WMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMWKd,.                 ............                 .,dKWMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMNOo,.                                        .,lONMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMN0d:'.                                 ':d0NMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMWN0xl;'.                      .';lx0NWMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMWX0xl;'.            .';ldOXWMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "--------------------------------------------------------------------------------\n";

    public String dashLogo =
            "--------------------------------------------------------------------------------\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMWNX0kxdolcc:::;;;;:::cclodxk0KNWMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMWX0kdlc:;;;;;;;:;;;;;;;;:;;;;;;;:cldk0XWMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMNKkdl::;;;;;;;;;;;::;;;;;;::;;;;;;;;:;;::cdkKNMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMWKkoc:::;;;;;;;;;;;;;;;;;;;;;;;;::;;;;:;;;;;:;:cokKWMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMN0dc:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:cd0NMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMN0o::;;;::;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::;;;::o0NMMMMMMMMMM\n" +
                    "MMMMMMMMW0o:::;;;;;;::;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:;;;;;;;;;:d0WMMMMMMMM\n" +
                    "MMMMMMWXxc::;;;;;:;;;:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:;;;:;;;;;::cxXWMMMMMM\n" +
                    "MMMMMW0o:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:;::o0WMMMMM\n" +
                    "MMMMWOc:;;;;;:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:;:cOWMMMM\n" +
                    "MMMNkc;:;;;:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:;;;:;ckNMMM\n" +
                    "MMWkc:;;;;;;;;;;;;;;;;;:clllllllllllllllllllllllllllllllllllllcc:;;;;:;;;;;ckNMM\n" +
                    "MWOc::;;;;;;;;;;:;;;;;;l0NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKOdc:;;;;:;;;cOWM\n" +
                    "MKo::;;;;;;;;;;;;;;;;;ckWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkc;;;;;;;;:oKM\n" +
                    "Nk:;;;;;;;;;;;;;::;;;:dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXd::;;:;;;;:xN\n" +
                    "Kl::;;:;;;;;;;;;;;;:;ckXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXWMMMMMMMMMMXo:;;;;:;;;;lK\n" +
                    "kc;;;;:;;;;;;;;;;;;;::ccccccccccccccccccccccccccccccccdKMMMMMMMMMWOc;;;;;:;;;;:k\n" +
                    "d::;;:;;;;;:;;::cccccccccccccccccc::;:;;;;;;;;;;;;;;;:kNMMMMMMMMMKo:;:;;;;;;;::d\n" +
                    "o;;;;;;:;;;;;:lOXXXXXXXXXXXXXXXXXKd:;;;:;;;;;;;;;;;;:oXMMMMMMMMMNx:;;;:;;;;;;;;o\n" +
                    "l;;::;;:;;:;;ckWMMMMMMMMMMMMMMMMWKl;;::;;;;;;;;;;;:;c0WMMMMMMMMWOc;;;;;;;;;::;;l\n" +
                    "o;;;;;;;;;;;:dXMMMMMMMMMMMMMMMMMXd:;;;;;;;;;;;;;;:;:xNMMMMMMMMMKo:;;;;;;;:;;;;;o\n" +
                    "o::;;;;;;;:;cxKKKKKKKKKKKKKKKKKKxc;:::;:;;;;;;;;;;:oKMMMMMMMMMNx:;;;;;;;;;;;;::d\n" +
                    "x:;;;;;;;;;;:::::::::::::::::::::::;;::;;;;;;;;;:;cOWMMMMMMMMW0c;;;;;;;;;;:;;;:x\n" +
                    "Oc;:;;;;;;;:;;::clllllllllllllllllllllllllllllllllkNMMMMMMMMMXo:;;;;;;;;;;;;:;cO\n" +
                    "Xd:;;::;;;;;;:;ckXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNWMMMMMMMMMXx:;;;;;;;;;;:;;;:dX\n" +
                    "WOc;:;;:;;;::;:xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0o:;;;;;;;;;;:;;;;cOW\n" +
                    "MNx:;;:;;;;;;;oKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0dc:;;:;;;;;;;;;;;;:xNM\n" +
                    "MMXd:;;;::;;;:xKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKOxl:;;;;;:::;;;;;;;;;:dXMM\n" +
                    "MMWKo:;;:;;;:::cccccccccccccccccccccccccccccccccccccc::;;;;;;;;;;;;;:;;;;;:oKMMM\n" +
                    "MMMWKo:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::;;;;;;;;;;;;;;;;::oKWMMM\n" +
                    "MMMMMXd:;;:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::;;;;;;;;;;;;;;:;;;;;:dXMMMMM\n" +
                    "MMMMMMNkl:;;;;;;;;:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:;;;;;;;;:;;;;;;:;:lkNMMMMMM\n" +
                    "MMMMMMMWKdc;;;:;;;;;::;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::;;;;;;;;;cdKWMMMMMMM\n" +
                    "MMMMMMMMMN0o:;;:;;;;;:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;::;;;;::;:o0NMMMMMMMMM\n" +
                    "MMMMMMMMMMMNOoc:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:cd0NMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMN0xl:;;;;;;;;;;;;:;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:lxKNMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMWXOdl:;;;;;::;::;;;;;;;;;;;;:;;;;;;;;;;;;;;::lx0XWMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMWX0koc::;;;::;;;;;;;;;;;;;;;;;;;:;;;::ldk0NWMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMWX0Oxolc::;;;;;;;::;;;:;;;::cldxO0XWMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMWNX0kxolcc::::::::ccloxO0XWMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "--------------------------------------------------------------------------------\n";
    public String ethereumClassicLogo =
            "--------------------------------------------------------------------------------\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOOKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxc;cONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOdl:;,:dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkoll:;,,;l0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0dolll:;;,,,ckNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNOdlllllc;;,,,,;dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxollodxOOkxl:;,,;l0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMN0dooxO0KX0OkO00Odl:,:kNMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMXOxk0KXKOxdoc;;:ldO00kdldKWMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMWXKXK0kdollllc;,,,,;:oxO00KNMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMWXOdllcllllll:;,,,,,,,,;cxKWMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMWX0kdl:;;;;;;;,,''''',:ok0KWMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMWXOOKK0koc;,,,''',;lxO00kx0NMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMWKxodk0KKOxoc:cdO00kdc:lOWMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOolooxk0KK00Odl:,,;dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0dllllodol:;,,,,:kNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkollll:;,,,,;l0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOdlll:;,,,;dXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxol:;,,:kNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkoc;;l0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOolxXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "--------------------------------------------------------------------------------\n";
    public String nemLogo = "--------------------------------------------------------------------------------\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMWNNXK00OkkkxxxxxxxxkkOO0KKXNWWMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMWNKOkdol:;,'......................',;cloxk0XNWMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMWX0kdl:,........'',,;;;::::::::::;;,,''.....  ...',:lxOKNWMMMMMMMMMMM\n" +
            "MMMMMMWN0xo:,......';:cloodxxxkkkkkkkkkkkkkkkkkxxoc:,'.............;cdkKWMMMMMMM\n" +
            "MMWN0dc,.....';clodxkkkkkkkkkkkkkkkkkkkkkkkkxdl;,,;:clodddddoolc:,......;lkKWMMM\n" +
            "W0o,.....,:ldxkkkkkkkkkkkkkkkkkkkkkkkkkkkkxl;..,codxxxxxxxxxxxxxxxdoc;,.....:xXM\n" +
            "0;...':odkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxdl,..,ldxxxxxxxxxxxxxxxxxxxxxxdoc;.. .lX\n" +
            "x. .;dkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkko;....:dxxxxxxxxxxxxxxxxxxxxxxxxxxxxl. .;0\n" +
            "x...:xkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkko'. ..cxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxo'. ;K\n" +
            "O' .;xkkkkkkkkkkkkkkkkkkkkkkkkkkkkkko'.  .:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxl' .:X\n" +
            "0; .,dkkkkkkkkkkkkkkkkkkkkkkkkkkkkkx:....,oxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxc. .lN\n" +
            "Xc. .okkkkkkkkkkkkkkkkkkkkkkkkkkkkkd,. ..;dxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx:. .xW\n" +
            "Wd. .cxkkkkkkkkkkkkkkkkkkkkkkkkkkkko'....;dxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxd,. ,0M\n" +
            "MO,..,dkkkkkkkkkkkkkkkkkkkkkkkkkkkko. ...'lxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxl...cNM\n" +
            "MNl. .ckkkkkkkkkkkkkkkkkkkkkkkkkkkkc.  . .,oxxxxxxxxxxxxxxxxxxxxxxxxxxxxd;...kWM\n" +
            "MMk'..'lkkkkkkkkkkkkkkkkkkkkkkkkkkd;.... ..'cdxxxxxxxxxxxxxxxxxxxxxxxxxxl...:XMM\n" +
            "MMNl. ..cxkkkkkkkkkkkkkkkkkkkkkkkx:.  .......'coxxxxxxxxxxxxxxxxxxxxxxxd;. .xWMM\n" +
            "MMMO,. ..;oxkkkkkkkkkkkkkkkkkkkkd:..  ....  ....;ldxxxxxxxxxxxxxxxxxxxxc. .lXMMM\n" +
            "MMMWd.....',ldxkkkkkkkkkkkkkkxo:'. ..     .. .. ...;cdxxxxxxxxxxxxxxxxl'..,0MMMM\n" +
            "MMMMXc. .':,..,:coddxxxxddoc;'.. ......''',,''.......'cdxxxxxxxxxxxxxo,. .xWMMMM\n" +
            "MMMMM0;...;lc,......''''..... ...';:clllloooollc:,... .,lxxxxxxxxxxxd;. .oNMMMMM\n" +
            "MMMMMWO,...:lol:;'...........',:clooooooooooooooooc;.. ..lxxxxxxxxxd;. .cXMMMMMM\n" +
            "MMMMMMWk'...:loooolcc::::::cllooooooooooooooooooooooc,...'oxxxxxxxd;...:KMMMMMMM\n" +
            "MMMMMMMWk'...:looooooooooooooooooooooooooooooooooooool;. .;dxxxxxo;. .:KMMMMMMMM\n" +
            "MMMMMMMMWk,...:looooooooooooooooooooooooooooooooooooool;. 'oxxxxo,. .cKMMMMMMMMM\n" +
            "MMMMMMMMMWO;...;looooooooooooooooooooooooooooooooooooooc'..lxxxl'. .lXMMMMMMMMMM\n" +
            "MMMMMMMMMMW0:...,loooooooooooooooooooooooooooooooooooool,..lxdc....dNMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMXo...':loooooooooooooooooooooooooooooooooool;.'oo;. .,kWMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMNk,...;looooooooooooooooooooooooooooooooool,.;c'. .cKWMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMWKl...':looooooooooooooooooooooooooooooooc......,xNMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMNk;...,cloooooooooooooooooooooooooooooc'.  ..lKWMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMXd'...,clooooooooooooooooooooooooooc'.  .:OWMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMWKo'...,clooooooooooooooooooooool:.. .;xNMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMWKo'...,clooooooooooooooooool:'...;xXMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMWKo,...';cooooooooooooolc,....:xXMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMWXx:....,:looooooooc;'...'cONMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMNOl,....,::cc:;'....;dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkc'. ........,oONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKxl;,,,,:oONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXKKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "--------------------------------------------------------------------------------\n";

}


