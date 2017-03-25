/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *Class for DraftPick.java
 *

 *
 **/
 
package FinalProject;

/**
 *
 * @author usmcw
 */
public class PlayerStats {
   private String[] stat1 = {"\nComp\tAtt\tPct\n93\t142\t65.5\n"};
   private String[] stat2 = {"\nComp\tAtt\tPct\n70\t98\t71.4\n"};
   private String[] stat3 = {"\nComp\tAtt\tPct\n80\t128\t62.5\n"};
   private String[] stat4 = {"\nComp\tAtt\tPct\n64\t96\t66.7\n"};
   private String[] stat5 = {"\nComp\tAtt\tPct\n40\t60\t66.7\n"};
   private String[] stat6 = {"\nAtt\tAtt/G\tYds\n22\t22.0\t125\n"};
   private String[] stat7 = {"\nAtt\tAtt/G\tYds\n65\t21.7\t357\n"};
   private String[] stat8 = {"\nAtt\tAtt/G\tYds\n38\t19.0\t195\n"};
   private String[] stat9 = {"\nAtt\tAtt/G\tYds\n31\t31.0\t73\n"};
   private String[] stat10= {"\nAtt\tAtt/G\tYds\n39\t13.0\t162\n"};
   private String[] stat11= {"\nAtt\tAtt/G\tYds\n12\t12.0\t39\n"};
   private String[] stat12= {"\nAtt\tAtt/G\tYds\n29\t9.7\t115\n"};
   private String[] stat13= {"\nAtt\tAtt/G\tYds\n35\t11.7\t109\n"};
   private String[] stat14= {"\nAtt\tAtt/G\tYds\n8\t8.0\t35\n"};
   private String[] stat15= {"\nAtt\tAtt/G\tYds\n11\t11.0\t34\n"};
   private String[] stat16= {"\nRec\tYds\tYds/G\n21\t342\t114.0\n"};
   private String[] stat17= {"\nRec\tYds\tYds/G\n19\t334\t111.3\n"};
   private String[] stat18= {"\nRec\tYds\tYds/G\n18\t309\t103.0\n"};
   private String[] stat19= {"\nRec\tYds\tYds/G\n18\t260\t86.7\n"};
   private String[] stat20= {"\nRec\tYds\tYds/G\n17\t332\t110.7\n"};
   private String[] stat21= {"\nRec\tYds\tYds/G\n16\t217\t72.3\n"};
   private String[] stat22= {"\nRec\tYds\tYds/G\n16\t184\t92.0\n"};
   private String[] stat23= {"\nRec\tYds\tYds/G\n13\t112\t37.3\n"};
   private String[] stat24= {"\nRec\tYds\tYds/G\n11\t102\t102.0\n"};
   private String[] stat25= {"\nRec\tYds\tYds/G\n11\t121\t40.3\n"};
   private String[] stat26= {"\nRec\tYds\tYds/G\n18\t229\t76.3\n"};
   private String[] stat27= {"\nRec\tYds\tYds/G\n11\t98\t32.7\n"};
   private String[] stat28= {"\nRec\tYds\tYds/G\n11\t137\t12.5\n"};
   private String[] stat29= {"\nRec\tYds\tYds/G\n6\t59\t29.5\n"};
   private String[] stat30= {"\nRec\tYds\tYds/G\n6\t65\t21.7\n"};
   private String[] stat31= {"\nRec\tYds\tYds/G\n6\t59\t59.0\n"};
   private String[] stat32= {"\nRec\tYds\tYds/G\n5\t77\t77.0n\n"};
   private String[] stat33= {"\nRec\tYds\tYds/G\n5\t34\t34.0\n"};
   private String[] stat34= {"\nRec\tYds\tYds/G\n4\t31\t31.0\n"};
   private String[] stat35= {"\nRec\tYds\tYds/G\n4\t66\t66.0\n"};
   private String[] stat36= {"\nComb\tTotal\tAst\n16\t6\t10\n"};
   private String[] stat37= {"\nComb\tTotal\tAst\n14\t4\t10\n"};
   private String[] stat38= {"\nComb\tTotal\tAst\n11\t5\t6\n"};
   private String[] stat39= {"\nComb\tTotal\tAst\n11\t8\t3\n"};
   private String[] stat40= {"\nComb\tTotal\tAst\n10\t9\t1\n"};
   private String[] stat41= {"\nComb\tTotal\tAst\n10\t7\t3\n"};
   private String[] stat42= {"\nComb\tTotal\tAst\n9\t5\t4\n"};
   private String[] stat43= {"\nComb\tTotal\tAst\n8\t4\t4\n"};
   private String[] stat44= {"\nComb\tTotal\tAst\n7\t6\t1\n"};
   private String[] stat45= {"\nComb\tTotal\tAst\n7\t2\t5\n"};
   private String[] stat46= {"\nComb\tTotal\tAst\n29\t17\t12\n"};
   private String[] stat47= {"\nComb\tTotal\tAst\n20\t15\t5\n"};
   private String[] stat48= {"\nComb\tTotal\tAst\n20\t15\t5\n"};
   private String[] stat49= {"\nComb\tTotal\tAst\n20\t15\t5\n"};
   private String[] stat50= {"\nComb\tTotal\tAst\n18\t14\t4\n"};
   private String[] stat51= {"\nComb\tTotal\tAst\n18\t11\t7\n"};
   private String[] stat52= {"\nComb\tTotal\tAst\n16\t8\t8\n"};
   private String[] stat53= {"\nComb\tTotal\tAst\n15\t10\t5\n"};
   private String[] stat54= {"\nComb\tTotal\tAst\n15\t8\t7\n"};
   private String[] stat55= {"\nComb\tTotal\tAst\n14\t3\t11\n"};
   private String[] stat56= {"\nComb\tTotal\tAst\n30\t24\t6\n"};
   private String[] stat57= {"\nComb\tTotal\tAst\n22\t16\t6\n"};
   private String[] stat58= {"\nComb\tTotal\tAst\n21\t19\t2\n"};
   private String[] stat59= {"\nComb\tTotal\tAst\n18\t16\t2\n"};
   private String[] stat60= {"\nComb\tTotal\tAst\n18\t8\t10\n"};
   private String[] stat61= {"\nComb\tTotal\tAst\n17\t7\t10\n"};
   private String[] stat62= {"\nComb\tTotal\tAst\n17\t15\t2\n"};
   private String[] stat63= {"\nComb\tTotal\tAst\n16\t13\t3\n"};
   private String[] stat64= {"\nComb\tTotal\tAst\n16\t9\t7\n"};
   private String[] stat65= {"\nComb\tTotal\tAst\n15\t11\t4\n"};
   private String[] stat66= {"\nAtt\tPct\tLng\n8\t100\t45\n"};
   private String[] stat67= {"\nAtt\tPct\tLng\n7\t100\t47\n"};
   private String[] stat68= {"\nAtt\tPct\tLng\n4\t100\t43\n"};
   private String[] stat69= {"\nAtt\tPct\tLng\n3\t100\t52\n"};
   private String[] stat70= {"\nAtt\tPct\tLng\n3\t100\t35\n"};
    /**
     * @return the stat1
     */
    public String[] getStat1() {
        return stat1;
    }

    /**
     * @param stat1 the stat1 to set
     */
    public void setStat1(String[] stat1) {
        this.stat1 = stat1;
    }

    /**
     * @return the stat2
     */
    public String[] getStat2() {
        return stat2;
    }

    /**
     * @param stat2 the stat2 to set
     */
    public void setStat2(String[] stat2) {
        this.stat2 = stat2;
    }

    /**
     * @return the stat3
     */
    public String[] getStat3() {
        return stat3;
    }

    /**
     * @param stat3 the stat3 to set
     */
    public void setStat3(String[] stat3) {
        this.stat3 = stat3;
    }

    /**
     * @return the stat4
     */
    public String[] getStat4() {
        return stat4;
    }

    /**
     * @param stat4 the stat4 to set
     */
    public void setStat4(String[] stat4) {
        this.stat4 = stat4;
    }

    /**
     * @return the stat5
     */
    public String[] getStat5() {
        return stat5;
    }

    /**
     * @param stat5 the stat5 to set
     */
    public void setStat5(String[] stat5) {
        this.stat5 = stat5;
    }

    /**
     * @return the stat6
     */
    public String[] getStat6() {
        return stat6;
    }

    /**
     * @param stat6 the stat6 to set
     */
    public void setStat6(String[] stat6) {
        this.stat6 = stat6;
    }

    /**
     * @return the stat7
     */
    public String[] getStat7() {
        return stat7;
    }

    /**
     * @param stat7 the stat7 to set
     */
    public void setStat7(String[] stat7) {
        this.stat7 = stat7;
    }

    /**
     * @return the stat8
     */
    public String[] getStat8() {
        return stat8;
    }

    /**
     * @param stat8 the stat8 to set
     */
    public void setStat8(String[] stat8) {
        this.stat8 = stat8;
    }

    /**
     * @return the stat9
     */
    public String[] getStat9() {
        return stat9;
    }

    /**
     * @param stat9 the stat9 to set
     */
    public void setStat9(String[] stat9) {
        this.stat9 = stat9;
    }

    /**
     * @return the stat10
     */
    public String[] getStat10() {
        return stat10;
    }

    /**
     * @param stat10 the stat10 to set
     */
    public void setStat10(String[] stat10) {
        this.stat10 = stat10;
    }

    /**
     * @return the stat11
     */
    public String[] getStat11() {
        return stat11;
    }

    /**
     * @param stat11 the stat11 to set
     */
    public void setStat11(String[] stat11) {
        this.stat11 = stat11;
    }

    /**
     * @return the stat12
     */
    public String[] getStat12() {
        return stat12;
    }

    /**
     * @param stat12 the stat12 to set
     */
    public void setStat12(String[] stat12) {
        this.stat12 = stat12;
    }

    /**
     * @return the stat13
     */
    public String[] getStat13() {
        return stat13;
    }

    /**
     * @param stat13 the stat13 to set
     */
    public void setStat13(String[] stat13) {
        this.stat13 = stat13;
    }

    /**
     * @return the stat14
     */
    public String[] getStat14() {
        return stat14;
    }

    /**
     * @param stat14 the stat14 to set
     */
    public void setStat14(String[] stat14) {
        this.stat14 = stat14;
    }

    /**
     * @return the stat15
     */
    public String[] getStat15() {
        return stat15;
    }

    /**
     * @param stat15 the stat15 to set
     */
    public void setStat15(String[] stat15) {
        this.stat15 = stat15;
    }

    /**
     * @return the stat16
     */
    public String[] getStat16() {
        return stat16;
    }

    /**
     * @param stat16 the stat16 to set
     */
    public void setStat16(String[] stat16) {
        this.stat16 = stat16;
    }

    /**
     * @return the stat17
     */
    public String[] getStat17() {
        return stat17;
    }

    /**
     * @param stat17 the stat17 to set
     */
    public void setStat17(String[] stat17) {
        this.stat17 = stat17;
    }

    /**
     * @return the stat18
     */
    public String[] getStat18() {
        return stat18;
    }

    /**
     * @param stat18 the stat18 to set
     */
    public void setStat18(String[] stat18) {
        this.stat18 = stat18;
    }

    /**
     * @return the stat19
     */
    public String[] getStat19() {
        return stat19;
    }

    /**
     * @param stat19 the stat19 to set
     */
    public void setStat19(String[] stat19) {
        this.stat19 = stat19;
    }

    /**
     * @return the stat20
     */
    public String[] getStat20() {
        return stat20;
    }

    /**
     * @param stat20 the stat20 to set
     */
    public void setStat20(String[] stat20) {
        this.stat20 = stat20;
    }

    /**
     * @return the stat21
     */
    public String[] getStat21() {
        return stat21;
    }

    /**
     * @param stat21 the stat21 to set
     */
    public void setStat21(String[] stat21) {
        this.stat21 = stat21;
    }

    /**
     * @return the stat22
     */
    public String[] getStat22() {
        return stat22;
    }

    /**
     * @param stat22 the stat22 to set
     */
    public void setStat22(String[] stat22) {
        this.stat22 = stat22;
    }

    /**
     * @return the stat23
     */
    public String[] getStat23() {
        return stat23;
    }

    /**
     * @param stat23 the stat23 to set
     */
    public void setStat23(String[] stat23) {
        this.stat23 = stat23;
    }

    /**
     * @return the stat24
     */
    public String[] getStat24() {
        return stat24;
    }

    /**
     * @param stat24 the stat24 to set
     */
    public void setStat24(String[] stat24) {
        this.stat24 = stat24;
    }

    /**
     * @return the stat25
     */
    public String[] getStat25() {
        return stat25;
    }

    /**
     * @param stat25 the stat25 to set
     */
    public void setStat25(String[] stat25) {
        this.stat25 = stat25;
    }

    /**
     * @return the stat26
     */
    public String[] getStat26() {
        return stat26;
    }

    /**
     * @param stat26 the stat26 to set
     */
    public void setStat26(String[] stat26) {
        this.stat26 = stat26;
    }

    /**
     * @return the stat27
     */
    public String[] getStat27() {
        return stat27;
    }

    /**
     * @param stat27 the stat27 to set
     */
    public void setStat27(String[] stat27) {
        this.stat27 = stat27;
    }

    /**
     * @return the stat28
     */
    public String[] getStat28() {
        return stat28;
    }

    /**
     * @param stat28 the stat28 to set
     */
    public void setStat28(String[] stat28) {
        this.stat28 = stat28;
    }

    /**
     * @return the stat29
     */
    public String[] getStat29() {
        return stat29;
    }

    /**
     * @param stat29 the stat29 to set
     */
    public void setStat29(String[] stat29) {
        this.stat29 = stat29;
    }

    /**
     * @return the stat30
     */
    public String[] getStat30() {
        return stat30;
    }

    /**
     * @param stat30 the stat30 to set
     */
    public void setStat30(String[] stat30) {
        this.stat30 = stat30;
    }

    /**
     * @return the stat31
     */
    public String[] getStat31() {
        return stat31;
    }

    /**
     * @param stat31 the stat31 to set
     */
    public void setStat31(String[] stat31) {
        this.stat31 = stat31;
    }

    /**
     * @return the stat32
     */
    public String[] getStat32() {
        return stat32;
    }

    /**
     * @param stat32 the stat32 to set
     */
    public void setStat32(String[] stat32) {
        this.stat32 = stat32;
    }

    /**
     * @return the stat33
     */
    public String[] getStat33() {
        return stat33;
    }

    /**
     * @param stat33 the stat33 to set
     */
    public void setStat33(String[] stat33) {
        this.stat33 = stat33;
    }

    /**
     * @return the stat34
     */
    public String[] getStat34() {
        return stat34;
    }

    /**
     * @param stat34 the stat34 to set
     */
    public void setStat34(String[] stat34) {
        this.stat34 = stat34;
    }

    /**
     * @return the stat35
     */
    public String[] getStat35() {
        return stat35;
    }

    /**
     * @param stat35 the stat35 to set
     */
    public void setStat35(String[] stat35) {
        this.stat35 = stat35;
    }

    /**
     * @return the stat36
     */
    public String[] getStat36() {
        return stat36;
    }

    /**
     * @param stat36 the stat36 to set
     */
    public void setStat36(String[] stat36) {
        this.stat36 = stat36;
    }

    /**
     * @return the stat37
     */
    public String[] getStat37() {
        return stat37;
    }

    /**
     * @param stat37 the stat37 to set
     */
    public void setStat37(String[] stat37) {
        this.stat37 = stat37;
    }

    /**
     * @return the stat38
     */
    public String[] getStat38() {
        return stat38;
    }

    /**
     * @param stat38 the stat38 to set
     */
    public void setStat38(String[] stat38) {
        this.stat38 = stat38;
    }

    /**
     * @return the stat39
     */
    public String[] getStat39() {
        return stat39;
    }

    /**
     * @param stat39 the stat39 to set
     */
    public void setStat39(String[] stat39) {
        this.stat39 = stat39;
    }

    /**
     * @return the stat40
     */
    public String[] getStat40() {
        return stat40;
    }

    /**
     * @param stat40 the stat40 to set
     */
    public void setStat40(String[] stat40) {
        this.stat40 = stat40;
    }

    /**
     * @return the stat41
     */
    public String[] getStat41() {
        return stat41;
    }

    /**
     * @param stat41 the stat41 to set
     */
    public void setStat41(String[] stat41) {
        this.stat41 = stat41;
    }

    /**
     * @return the stat42
     */
    public String[] getStat42() {
        return stat42;
    }

    /**
     * @param stat42 the stat42 to set
     */
    public void setStat42(String[] stat42) {
        this.stat42 = stat42;
    }

    /**
     * @return the stat43
     */
    public String[] getStat43() {
        return stat43;
    }

    /**
     * @param stat43 the stat43 to set
     */
    public void setStat43(String[] stat43) {
        this.stat43 = stat43;
    }

    /**
     * @return the stat44
     */
    public String[] getStat44() {
        return stat44;
    }

    /**
     * @param stat44 the stat44 to set
     */
    public void setStat44(String[] stat44) {
        this.stat44 = stat44;
    }

    /**
     * @return the stat45
     */
    public String[] getStat45() {
        return stat45;
    }

    /**
     * @param stat45 the stat45 to set
     */
    public void setStat45(String[] stat45) {
        this.stat45 = stat45;
    }

    /**
     * @return the stat46
     */
    public String[] getStat46() {
        return stat46;
    }

    /**
     * @param stat46 the stat46 to set
     */
    public void setStat46(String[] stat46) {
        this.stat46 = stat46;
    }

    /**
     * @return the stat47
     */
    public String[] getStat47() {
        return stat47;
    }

    /**
     * @param stat47 the stat47 to set
     */
    public void setStat47(String[] stat47) {
        this.stat47 = stat47;
    }

    /**
     * @return the stat48
     */
    public String[] getStat48() {
        return stat48;
    }

    /**
     * @param stat48 the stat48 to set
     */
    public void setStat48(String[] stat48) {
        this.stat48 = stat48;
    }

    /**
     * @return the stat49
     */
    public String[] getStat49() {
        return stat49;
    }

    /**
     * @param stat49 the stat49 to set
     */
    public void setStat49(String[] stat49) {
        this.stat49 = stat49;
    }

    /**
     * @return the stat50
     */
    public String[] getStat50() {
        return stat50;
    }

    /**
     * @param stat50 the stat50 to set
     */
    public void setStat50(String[] stat50) {
        this.stat50 = stat50;
    }

    /**
     * @return the stat51
     */
    public String[] getStat51() {
        return stat51;
    }

    /**
     * @param stat51 the stat51 to set
     */
    public void setStat51(String[] stat51) {
        this.stat51 = stat51;
    }

    /**
     * @return the stat52
     */
    public String[] getStat52() {
        return stat52;
    }

    /**
     * @param stat52 the stat52 to set
     */
    public void setStat52(String[] stat52) {
        this.stat52 = stat52;
    }

    /**
     * @return the stat53
     */
    public String[] getStat53() {
        return stat53;
    }

    /**
     * @param stat53 the stat53 to set
     */
    public void setStat53(String[] stat53) {
        this.stat53 = stat53;
    }

    /**
     * @return the stat54
     */
    public String[] getStat54() {
        return stat54;
    }

    /**
     * @param stat54 the stat54 to set
     */
    public void setStat54(String[] stat54) {
        this.stat54 = stat54;
    }

    /**
     * @return the stat55
     */
    public String[] getStat55() {
        return stat55;
    }

    /**
     * @param stat55 the stat55 to set
     */
    public void setStat55(String[] stat55) {
        this.stat55 = stat55;
    }

    /**
     * @return the stat56
     */
    public String[] getStat56() {
        return stat56;
    }

    /**
     * @param stat56 the stat56 to set
     */
    public void setStat56(String[] stat56) {
        this.stat56 = stat56;
    }

    /**
     * @return the stat57
     */
    public String[] getStat57() {
        return stat57;
    }

    /**
     * @param stat57 the stat57 to set
     */
    public void setStat57(String[] stat57) {
        this.stat57 = stat57;
    }

    /**
     * @return the stat58
     */
    public String[] getStat58() {
        return stat58;
    }

    /**
     * @param stat58 the stat58 to set
     */
    public void setStat58(String[] stat58) {
        this.stat58 = stat58;
    }

    /**
     * @return the stat59
     */
    public String[] getStat59() {
        return stat59;
    }

    /**
     * @param stat59 the stat59 to set
     */
    public void setStat59(String[] stat59) {
        this.stat59 = stat59;
    }

    /**
     * @return the stat60
     */
    public String[] getStat60() {
        return stat60;
    }

    /**
     * @param stat60 the stat60 to set
     */
    public void setStat60(String[] stat60) {
        this.stat60 = stat60;
    }

    /**
     * @return the stat61
     */
    public String[] getStat61() {
        return stat61;
    }

    /**
     * @param stat61 the stat61 to set
     */
    public void setStat61(String[] stat61) {
        this.stat61 = stat61;
    }

    /**
     * @return the stat62
     */
    public String[] getStat62() {
        return stat62;
    }

    /**
     * @param stat62 the stat62 to set
     */
    public void setStat62(String[] stat62) {
        this.stat62 = stat62;
    }

    /**
     * @return the stat63
     */
    public String[] getStat63() {
        return stat63;
    }

    /**
     * @param stat63 the stat63 to set
     */
    public void setStat63(String[] stat63) {
        this.stat63 = stat63;
    }

    /**
     * @return the stat64
     */
    public String[] getStat64() {
        return stat64;
    }

    /**
     * @param stat64 the stat64 to set
     */
    public void setStat64(String[] stat64) {
        this.stat64 = stat64;
    }

    /**
     * @return the stat65
     */
    public String[] getStat65() {
        return stat65;
    }

    /**
     * @param stat65 the stat65 to set
     */
    public void setStat65(String[] stat65) {
        this.stat65 = stat65;
    }

    /**
     * @return the stat66
     */
    public String[] getStat66() {
        return stat66;
    }

    /**
     * @param stat66 the stat66 to set
     */
    public void setStat66(String[] stat66) {
        this.stat66 = stat66;
    }

    /**
     * @return the stat67
     */
    public String[] getStat67() {
        return stat67;
    }

    /**
     * @param stat67 the stat67 to set
     */
    public void setStat67(String[] stat67) {
        this.stat67 = stat67;
    }

    /**
     * @return the stat68
     */
    public String[] getStat68() {
        return stat68;
    }

    /**
     * @param stat68 the stat68 to set
     */
    public void setStat68(String[] stat68) {
        this.stat68 = stat68;
    }

    /**
     * @return the stat69
     */
    public String[] getStat69() {
        return stat69;
    }

    /**
     * @param stat69 the stat69 to set
     */
    public void setStat69(String[] stat69) {
        this.stat69 = stat69;
    }

    /**
     * @return the stat70
     */
    public String[] getStat70() {
        return stat70;
    }

    /**
     * @param stat70 the stat70 to set
     */
    public void setStat70(String[] stat70) {
        this.stat70 = stat70;
    }
}
