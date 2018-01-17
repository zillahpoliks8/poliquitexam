package com.uic.prelimexam.poliquitexam;

/**
 * Created by chain on 12/27/2017.
 */

public class Bugtong {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 50;          //Array maximum size
    public final int TOTAL_SIZE = 50;

    public static int items = 1;//Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 50;           /*Scoring Rule:
                                                if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public Bugtong() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

        bugtong[0] = "Isang balong malalim, punong-puno ng patalim.";
        choices[0][0] = "Bibig";
        choices[0][1] = "Ilong";
        choices[0][2] = "Tainga";
        choices[0][3] = "Mata";
        answer[0] = "A";

        bugtong[1] = "Dalawang batong maitim, malayo ang dinarating.";
        choices[1][0] = "Bibig";
        choices[1][1] = "Ilong";
        choices[1][2] = "Tainga";
        choices[1][3] = "Mata";
        answer[1] = "D";

        bugtong[2] = "Dalawang balon, hindi malingon.";
        choices[2][0] = "Bibig";
        choices[2][1] = "Ilong";
        choices[2][2] = "Tainga";
        choices[2][3] = "Mata";
        answer[2] = "C";

        bugtong[3] = "Naligo ang kapitan, hindi nabasa ang tiyan. ";
        choices[3][0] = "Sasakyan";
        choices[3][1] = "Bangka";
        choices[3][2] = "Bola";
        choices[3][3] = "Gulong";
        answer[3] = "B";

        bugtong[4] = "Limang puno ng niyog, isa’y matayog.";
        choices[4][0] = "Siko";
        choices[4][1] = "Binti";
        choices[4][2] = "Hita";
        choices[4][3] = "Daliri";
        answer[4] = "D";

        bugtong[0] = "Hindi pari, hindi hari, nagdadamit ng sari-sari.";
        choices[5][0] = "Paruparo";
        choices[5][1] = "Ibon";
        choices[5][2] = "Agila";
        choices[5][3] = "Langaw";
        answer[5] = "A";

        bugtong[1] = "Buto’t balat lumilipad.";
        choices[6][0] = "Buto";
        choices[6][1] = "Papel";
        choices[6][2] = "Lapis";
        choices[6][3] = "Saranggola";
        answer[6] = "D";

        bugtong[7] = "Maliit na bahay, puno ng mga patay.";
        choices[7][0] = "Palito";
        choices[7][1] = "Palayok";
        choices[7][2] = "Posporo";
        choices[7][3] = "Lapis";
        answer[7] = "C";

        bugtong[8] = "Baboy ko sa pulo, ang balahibo’y pako.";
        choices[8][0] = "Bangka";
        choices[8][1] = "Langka";
        choices[8][2] = "Tuka";
        choices[8][3] = "Bakla";
        answer[8] = "B";

        bugtong[9] = "Limang puno ng niyog, isa’y matayog.";
        choices[9][0] = "Siko";
        choices[9][1] = "Binti";
        choices[9][2] = "Hita";
        choices[9][3] = "Daliri";
        answer[9] = "D";

        bugtong[10] = "May puno walang bunga, may dahon walang sanga.";
        choices[10][0] = "Sandok";
        choices[10][1] = "Pandak";
        choices[10][2] = "Kodak";
        choices[10][3] = "Sapak";
        answer[10] = "A";

        bugtong[11] = "Eto na ang magkapatid, nag-uunahang pumanhik.";
        choices[11][0] = "Mga Bibig";
        choices[11][1] = "Mga Ilong";
        choices[11][2] = "Mga Daliri";
        choices[11][3] = "Mga Paa";
        answer[11] = "D";

        bugtong[12] = "Nakayuko ang reyna di nalalaglag ang korona.";
        choices[12][0] = "Kamatis";
        choices[12][1] = "Mansanas";
        choices[12][2] = "Bayabas";
        choices[12][3] = "Patatas";
        answer[12] = "C";

        bugtong[13] = "Isda ko sa maribeles nasa loob ang kaliskis.";
        choices[13][0] = "Kamatis";
        choices[13][1] = "Sili";
        choices[13][2] = "Papaya";
        choices[13][3] = "Langka";
        answer[13] = "B";

        bugtong[14] = "May isang prinsesa nakaupo sa tasa.";
        choices[14][0] = "Siko";
        choices[14][1] = "Kamatis";
        choices[14][2] = "Hito";
        choices[14][3] = "Kasoy";
        answer[14] = "D";

        bugtong[15] = "Matanda na ang nuno di pa naliligo.";
        choices[15][0] = "Pusa";
        choices[15][1] = "Aso";
        choices[15][2] = "Agila";
        choices[15][3] = "Kuneho";
        answer[15] = "A";

        bugtong[16] = "Hayan na si kaka bukaka ng bukaka";
        choices[16][0] = "Lapis";
        choices[16][1] = "Papel";
        choices[16][2] = "Libro";
        choices[16][3] = "Gunting";
        answer[16] = "D";

        bugtong[17] = "Nagtago si Pedro nakalabas ang ulo";
        choices[17][0] = "Siko";
        choices[17][1] = "Taho";
        choices[17][2] = "Pako";
        choices[17][3] = "Martilyo";
        answer[17] = "C";

        bugtong[18] = "Ate mo, ate ko, ate ng lahat ng tao.";
        choices[18][0] = "Mansanas";
        choices[18][1] = "Atis";
        choices[18][2] = "Patatas";
        choices[18][3] = "Kamatis";
        answer[18] = "B";

        bugtong[19] = "Maliit pa si kumpare, nakakaakyat na sa tore.";
        choices[19][0] = "Sili";
        choices[19][1] = "Kuneho";
        choices[19][2] = "Ibon";
        choices[19][3] = "Langgam";
        answer[19] = "D";

        bugtong[20] = "Dumaan ang hari, nagkagatan ang mga pari.";
        choices[20][0] = "Zipper";
        choices[20][1] = "Pantalon";
        choices[20][2] = "Sapatos";
        choices[20][3] = "Mata";
        answer[20] = "A";

        bugtong[21] = "Ako ay may kaibigan, kasama ko kahit saan.";
        choices[21][0] = "Puno";
        choices[21][1] = "Aso";
        choices[21][2] = "Tainga";
        choices[21][3] = "Anino";
        answer[21] = "D";

        bugtong[22] = "Heto na si Kaka, bubuka-bukaka.";
        choices[22][0] = "Aso";
        choices[22][1] = "Pusa";
        choices[22][2] = "Palakaa";
        choices[22][3] = "Langgam";
        answer[22] = "C";

        bugtong[23] = "Hinila ko ang baging, sumigaw ang matsing.";
        choices[23][0] = "Simbahan";
        choices[23][1] = "Kampana";
        choices[23][2] = "Pari";
        choices[23][3] = "Gulong";
        answer[23] = "B";

        bugtong[24] = "Limang puno ng niyog, isa’y matayog.";
        choices[24][0] = "Siko";
        choices[24][1] = "Binti";
        choices[24][2] = "Hita";
        choices[24][3] = "Daliri";
        answer[24] = "D";

        bugtong[25] = "Nakakaluto’y walang init, umuusok kahit na malamig.";
        choices[25][0] = "Yelo";
        choices[25][1] = "Dilaw";
        choices[25][2] = "Dalandan";
        choices[25][3] = "Mata";
        answer[25] = "A";

        bugtong[26] = "Hindi naman hari, hindi naman pare, nagsusuot ng sarisari.";
        choices[26][0] = "Damit";
        choices[26][1] = "Sapatos";
        choices[26][2] = "Buhok";
        choices[26][3] = "Sampayan";
        answer[26] = "D";

        bugtong[27] = "Sinampal ko muna bago inalok.";
        choices[27][0] = "Gulong";
        choices[27][1] = "Ilong";
        choices[27][2] = "Sampalok";
        choices[27][3] = "Mata";
        answer[27] = "C";

        bugtong[28] = "Bumili ako ng alipin, mataas pa sa akin.";
        choices[28][0] = "Damit";
        choices[28][1] = "Sumbrero";
        choices[28][2] = "Bola";
        choices[28][3] = "Gulong";
        answer[28] = "B";

        bugtong[29] = "Ang anak ay nakaupo na, ang ina’y gumagapang pa.";
        choices[29][0] = "Sitaw";
        choices[29][1] = "Bataw";
        choices[29][2] = "Patani";
        choices[29][3] = "Kalabasa";
        answer[29] = "D";

        bugtong[30] = "Nang sumipot sa maliwanag, kulubot na ang balat.";
        choices[30][0] = "Ampalaya";
        choices[30][1] = "Kamatis";
        choices[30][2] = "Sitaw";
        choices[30][3] = "Bataw";
        answer[30] = "A";

        bugtong[31] = "Kung kailan mo pinatay, saka pa humaba ang buhay.";
        choices[31][0] = "Posporo";
        choices[31][1] = "Palito";
        choices[31][2] = "Tainga";
        choices[31][3] = "Kandila";
        answer[31] = "D";

        bugtong[32] = "Isa ang pasukan, tatlo ang labasan.";
        choices[32][0] = "Sapatos";
        choices[32][1] = "Ilong";
        choices[32][2] = "Kamiseta";
        choices[32][3] = "Mata";
        answer[32] = "C";

        bugtong[33] = "Kaban ng aking liham, may tagpi ang ibabaw.";
        choices[33][0] = "Kasyo";
        choices[33][1] = "Sobre";
        choices[33][2] = "Kasya";
        choices[33][3] = "Sobra";
        answer[33] = "B";

        bugtong[34] = "Isang pirasong tela lang ito, sinasaluduhan ng mga sundalo.";
        choices[34][0] = "Tela";
        choices[34][1] = "Sapatos";
        choices[34][2] = "Hita";
        choices[34][3] = "Watawat";
        answer[34] = "D";

        bugtong[35] = "Malambot na parang ulap, kasama ko sa pangangarap.";
        choices[35][0] = "Unan";
        choices[35][1] = "Kumot";
        choices[35][2] = "Kama";
        choices[35][3] = "Kwarto";
        answer[35] = "A";

        bugtong[36] = "Dikin ng hari, palamuti sa daliri.";
        choices[36][0] = "Relo";
        choices[36][1] = "Kwintas";
        choices[36][2] = "Korona";
        choices[36][3] = "Singsing";
        answer[36] = "D";

        bugtong[37] = "Isang hukbong sundalo, dikit-dikit ang mga ulo.";
        choices[37][0] = "Pinto";
        choices[37][1] = "Gulong";
        choices[37][2] = "Walis";
        choices[37][3] = "Mata";
        answer[37] = "C";

        bugtong[38] = "Huminto nang pawalan, lumakad nang talian.";
        choices[38][0] = "Sasakyan";
        choices[38][1] = "Sapatos";
        choices[38][2] = "Bola";
        choices[38][3] = "Gulong";
        answer[38] = "B";

        bugtong[39] = "Ako’y aklat ng panahon, binabago taun-taon.";
        choices[39][0] = "Pinto";
        choices[39][1] = "Papel";
        choices[39][2] = "Hita";
        choices[39][3] = "Kalandaryo";
        answer[39] = "D";

        bugtong[40] = "Kung tawagin nila’y “santo” hindi naman milagroso.";
        choices[40][0] = "Kamatis";
        choices[40][1] = "Mansanas";
        choices[40][2] = "Tainga";
        choices[40][3] = "Santol";
        answer[40] = "D";

        bugtong[41] = "Instrumentong pangharana, hugis nito ay katawan ng dalaga.";
        choices[41][0] = "Kanta";
        choices[41][1] = "Upuan";
        choices[41][2] = "Gitara";
        choices[41][3] = "Mata";
        answer[41] = "C";

        bugtong[42] = "Itapon mo kahit saan, babalik sa pinanggalingan.";
        choices[42][0] = "Yaya";
        choices[42][1] = "Yoyo";
        choices[42][2] = "Yeye";
        choices[42][3] = "Yuyu";
        answer[42] = "B";

        bugtong[43] = "Nagbibigay na, sinasakal pa";
        choices[43][0] = "Buto";
        choices[43][1] = "Bato";
        choices[43][2] = "Buko";
        choices[43][3] = "Bote";
        answer[43] = "D";

        bugtong[44] = "Hindi hayop, hindi tao, pumupulupot sa tiyan mo.";
        choices[44][0] = "Pantalon";
        choices[44][1] = "Ilong";
        choices[44][2] = "Tainga";
        choices[44][3] = "Sinturon";
        answer[44] = "D";

        bugtong[45] = "Sa maling kalabit, may buhay na kapalit.";
        choices[45][0] = "Mesa";
        choices[45][1] = "Ilong";
        choices[45][2] = "Baril";
        choices[45][3] = "Mata";
        answer[45] = "C";

        bugtong[46] = "Lumuluha walang mata, lumalakad walang paa.";
        choices[46][0] = "Lapis";
        choices[46][1] = "Ballpen";
        choices[46][2] = "Bola";
        choices[46][3] = "Gulong";
        answer[46] = "B";

        bugtong[47] = "Pitak-pitak, silid-silid, pinto man ay di masilip.";
        choices[47][0] = "Puno";
        choices[47][1] = "Binti";
        choices[47][2] = "Hita";
        choices[47][3] = "Kawayan";
        answer[47] = "D";

        bugtong[48] = "Batong marmol na buto, binalot ng gramatiko.";
        choices[48][0] = "Bibig";
        choices[48][1] = "Ilong";
        choices[48][2] = "Ngipin";
        choices[48][3] = "Mata";
        answer[48] = "C";

        bugtong[49] = "Bahay ni Mang Kulas, nang magiba’y tumaas.";
        choices[49][0] = "Sasakyan";
        choices[49][1] = "Payong";
        choices[49][2] = "Bola";
        choices[49][3] = "Kabute";
        answer[49] = "B";
    }
    public String getBugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
