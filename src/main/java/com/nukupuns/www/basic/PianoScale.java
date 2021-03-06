package com.nukupuns.www.basic;

/**
 * 音阶（scale）：全音阶，按照钢琴键盘的88个音高，从C1到C8，并将唱名和音程标明在里面
 * 音高 C    D   E   F   G    A   B
 * 标记 1    2   3   4   5    6   7
 * 唱名 do  re   mi  fa  sol  la  si
 *
 *  * 升调记号：♯ ，降调记号：♭ ，还原记号：♮ 。
 * C、♯C(♭D)、D、♯D(♭E)、E、F、♯F(♭G)、G、♯G(♭A)、A、♯A(♭B)、B
 */

public enum PianoScale {
    //格式为：调号（音调整数 名字 标记1(全音级，标记2(大字组)，音级，唱名，简谱，震动频率）
    //大字2组
    A0(1,"A0","A0","A2","A","la","6",27.500),
    S_A0(2,"升A0","♯A0","♯A2","♯A","♯la","♯6",29.135),
    F_B0(2,"降B0","♭B0","♭B2","♭B","♭si","♭7",29.135),
    B0(3,"B0","B0","B2","B","si","7",30.868),

    //大字1组
    C1(4,"C1","C1","C1","C","do","1",32.703),
    S_C1(5,"升C1","♯C1","♯C1","♯C","♯do","♯C1",34.648),
    F_D1(5,"降D1","♭D1","♭D1","♭D","♭re","♭2",34.648),
    D1(6,"D1","D1","D1","D","re","2",36.708),
    S_D1(7,"升D1","♯D1","♯D1","♯D","♯re","♯2",38.891),
    F_E1(7,"降E1","♭E1","♭E1","♭E","♭mi","♭3",38.891),
    E1(8,"E1","E1","E1","E","mi","3",41.203),
    F1(9,"F1","F1","F1","F","fa","4",43.654),
    S_F1(10,"升F1","♯F1","♯F1","♯F","♯fa","♯4",46.249),
    F_G1(10,"降G1","♭G1","♭G1","♭G","♭sol","♭5",46.249),
    G1(11,"G1","G1","G1","G","sol","5",48.999),
    S_G1(12,"升G1","♯G1","♯G1","♯G","♯sol","♯5",51.913),
    F_A1(12,"降A1","♭A1","♭A1","♭A","♭la","♭6",51.913),
    A1(13,"A1","A1","A1","A","la","6",55.000),
    S_A1(14,"升A1","♯A1","♯A1","♯A","♯la","♯6",58.270),
    F_B1(14,"降B1","♭B1","♭B1","♭B","♭si","♭7",58.270),
    B1(15,"B1","B1","B1","B","si","7",61.735),

    //大字组
    C2(16,"C2","C2","C","C","do","1",65.406),
    S_C2(17,"升C2","♯C2","♯C","♯C","♯do","♯C1",69.296),
    F_D2(17,"降D2","♭D2","♭D","♭D","♭re","♭2",69.296),
    D2(18,"D2","D2","D","D","re","2",73.416),
    S_D2(19,"升D2","♯D2","♯D","♯D","♯re","♯2",77.782),
    F_E2(19,"降E2","♭E2","♭E","♭E","♭mi","♭3",77.782),
    E2(20,"E2","E2","E","E","mi","3",82.407),
    F2(21,"F2","F2","F","F","fa","4",87.307),
    S_F2(22,"升F2","♯F2","♯F","♯F","♯fa","♯4",92.499),
    F_G2(22,"降G2","♭G2","♭G","♭G","♭sol","♭5",92.499),
    G2(23,"G2","G2","G","G","sol","5",97.999),
    S_G2(24,"升G2","♯G2","♯G","♯G","♯sol","♯5",103.826),
    F_A2(24,"降A2","♭A2","♭A","♭A","♭la","♭6",103.826),
    A2(25,"A2","A2","A","A","la","6",110.000),
    S_A2(26,"升A2","♯A2","♯A","♯A","♯la","♯6",116.541),
    F_B2(26,"降B2","♭B2","♭B","♭B","♭si","♭7",116.541),
    B2(27,"B2","B2","B","B","si","7",123.471),

    //小字组
    C3(28,"C3","C3","c","C","do","1",130.813),
    S_C3(29,"升C3","♯C3","♯c","♯C","♯do","♯C1",138.591),
    F_D3(29,"降D3","♭D3","♭c","♭D","♭re","♭2",138.591),
    D3(30,"D3","D3","d","D","re","2",146.832),
    S_D3(31,"升D3","♯D3","♯d","♯D","♯re","♯2",155.563),
    F_E3(31,"降E3","♭E3","♭e","♭E","♭mi","♭3",155.563),
    E3(32,"E3","E3","e","E","mi","3",164.814),
    F3(33,"F3","F3","f","F","fa","4",174.614),
    S_F3(34,"升F3","♯F3","♯f","♯F","♯fa","♯4",184.997),
    F_G3(34,"降G3","♭G3","♭g","♭G","♭sol","♭5",184.997),
    G3(35,"G3","G3","g","G","sol","5",195.998),
    S_G3(36,"升G3","♯G3","♯g","♯G","♯sol","♯5",207.652),
    F_A3(36,"降A3","♭A3","♭a","♭A","♭la","♭6",207.652),
    A3(37,"A3","A3","a","A","la","6",220.000),
    S_A3(38,"升A3","♯A3","♯a","♯A","♯la","♯6",233.082),
    F_B3(38,"降B3","♭B3","♭b","♭B","♭si","♭7",233.082),
    B3(39,"B3","B3","b","B","si","7",246.942),

    //小字1组
    C4(40,"C4","C4","c1","C","do","1",261.626),
    S_C4(41,"升C4","♯C4","♯c1","♯C","♯do","♯C1",277.183),
    F_D4(41,"降D4","♭D4","♭c1","♭D","♭re","♭2",277.183),
    D4(42,"D4","D4","d1","D","re","2",293.665),
    S_D4(43,"升D4","♯D4","♯d1","♯D","♯re","♯2",311.127),
    F_E4(43,"降E4","♭E4","♭e1","♭E","♭mi","♭3",311.127),
    E4(44,"E4","E4","e1","E","mi","3",329.628),
    F4(45,"F4","F4","f1","F","fa","4",349.228),
    S_F4(46,"升F4","♯F4","♯f1","♯F","♯fa","♯4",369.994),
    F_G4(46,"降G4","♭G4","♭g1","♭G","♭sol","♭5",369.994),
    G4(47,"G4","G4","g1","G","sol","5",391.995),
    S_G4(48,"升G4","♯G4","♯g1","♯G","♯sol","♯5",415.305),
    F_A4(48,"降A4","♭A4","♭a1","♭A","♭la","♭6",415.305),
    A4(49,"A4","A4","a1","A","la","6",440.000),
    S_A4(50,"升A4","♯A4","♯a1","♯A","♯la","♯6",466.164),
    F_B4(50,"降B4","♭B4","♭b1","♭B","♭si","♭7",466.164),
    B4(51,"B4","B4","b1","B","si","7",493.883),

    //小字2组
    C5(52,"C5","C5","c2","C","do","1",523.251),
    S_C5(53,"升C5","♯C5","♯c2","♯C","♯do","♯C1",554.365),
    F_D5(53,"降D5","♭D5","♭c2","♭D","♭re","♭2",554.365),
    D5(54,"D5","D5","d2","D","re","2",587.330),
    S_D5(55,"升D5","♯D5","♯d2","♯D","♯re","♯2",622.254),
    F_E5(55,"降E5","♭E5","♭e2","♭E","♭mi","♭3",622.254),
    E5(56,"E5","E5","e2","E","mi","3",659.255),
    F5(57,"F5","F5","f2","F","fa","4",698.456),
    S_F5(58,"升F5","♯F5","♯f2","♯F","♯fa","♯4",739.989),
    F_G5(58,"降G5","♭G5","♭g2","♭G","♭sol","♭5",739.989),
    G5(59,"G5","G5","g2","G","sol","5",783.991),
    S_G5(60,"升G5","♯G5","♯g2","♯G","♯sol","♯5",830.609),
    F_A5(60,"降A5","♭A5","♭a2","♭A","♭la","♭6",830.609),
    A5(61,"A5","A5","a2","A","la","6",880.000),
    S_A5(62,"升A5","♯A5","♯a2","♯A","♯la","♯6",932.328),
    F_B5(62,"降B5","♭B5","♭b2","♭B","♭si","♭7",932.328),
    B5(63,"B5","B5","b2","B","si","7",987.767),

    //小字3组
    C6(64,"C6","C6","c3","C","do","1",1046.502),
    S_C6(65,"升C6","♯C6","♯c3","♯C","♯do","♯C1",1108.731),
    F_D6(65,"降D6","♭D6","♭c3","♭D","♭re","♭2",1108.731),
    D6(66,"D6","D6","d3","D","re","2",1174.659),
    S_D6(67,"升D6","♯D6","♯d3","♯D","♯re","♯2",1244.508),
    F_E6(67,"降E6","♭E6","♭e3","♭E","♭mi","♭3",1244.508),
    E6(68,"E6","E6","e3","E","mi","3",1318.510),
    F6(69,"F6","F6","f3","F","fa","4",1396.913),
    S_F6(70,"升F6","♯F6","♯f3","♯F","♯fa","♯4",1479.978),
    F_G6(70,"降G6","♭G6","♭g3","♭G","♭sol","♭5",1479.978),
    G6(71,"G6","G6","g3","G","sol","5",1567.982),
    S_G6(72,"升G6","♯G6","♯g3","♯G","♯sol","♯5",1661.219),
    F_A6(72,"降A6","♭A6","♭a3","♭A","♭la","♭6",1661.219),
    A6(73,"A6","A6","a3","A","la","6",1760.000),
    S_A6(74,"升A6","♯A6","♯a3","♯A","♯la","♯6",1864.655),
    F_B6(74,"降B6","♭B6","♭b3","♭B","♭si","♭7",1864.655),
    B6(75,"B6","B6","b3","B","si","7",1975.533),

    //小字4组
    C7(76,"C7","C7","c4","C","do","1",2093.005),
    S_C7(77,"升C7","♯C7","♯c4","♯C","♯do","♯C1",2217.461),
    F_D7(77,"降D7","♭D7","♭c4","♭D","♭re","♭2",2217.461),
    D7(78,"D7","D7","d4","D","re","2",2349.318),
    S_D7(79,"升D7","♯D7","♯d4","♯D","♯re","♯2",2489.016),
    F_E7(79,"降E7","♭E7","♭e4","♭E","♭mi","♭3",2489.016),
    E7(80,"E7","E7","e4","E","mi","3",2637.020),
    F7(81,"F7","F7","f4","F","fa","4",2793.826),
    S_F7(82,"升F7","♯F7","♯f4","♯F","♯fa","♯4",2959.955),
    F_G7(82,"降G7","♭G7","♭g4","♭G","♭sol","♭5",2959.955),
    G7(83,"G7","G7","g4","G","sol","5",3135.963),
    S_G7(84,"升G7","♯G7","♯g4","♯G","♯sol","♯5",3322.438),
    F_A7(84,"降A7","♭A7","♭a4","♭A","♭la","♭6",3322.438),
    A7(85,"A7","A7","a4","A","la","6",3520.000),
    S_A7(86,"升A7","♯A7","♯a4","♯A","♯la","♯6",3729.310),
    F_B7(86,"降B7","♭B7","♭b4","♭B","♭si","♭7",3729.310),
    B7(87,"B7","B7","b4","B","si","7",3951.066),

    //小字5组
    C8(88,"C8","C8","c5","C","do","1",4186.009);

    private PianoScale(int number, String name, String intervalStep, String intervalBig, String pitch, String syllable,
                       String key, double frequency){
        this.number = number;
        this.name = name;
        this.intervalStep = intervalStep;
        this.intervalBig = intervalBig;
        this.pitch = pitch;
        this.syllable = syllable;
        this.key = key;
        this.frequency = frequency;
    }

    private final int number; //向量整数
    private final String name;//名称
    private final String intervalStep; //C1起的音级
    private final String intervalBig;//A2起的音级，大字组
    private final String pitch;//音级
    private final String syllable;//唱名
    private final String key;//简谱名
    private final double frequency;//频率

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getIntervalStep() {
        return intervalStep;
    }

    public String getIntervalBig() {
        return intervalBig;
    }

    public String getPitch() {
        return pitch;
    }

    public String getSyllable() {
        return syllable;
    }

    public String getKey() {
        return key;
    }

    public double getFrequency() {
        return frequency;
    }
}
