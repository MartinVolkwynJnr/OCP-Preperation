package Chapter12;

import Chapter12.enums.Season;

public class ChapterTwelveMain {
    public static void main(String[] args) {
        Season winter = Season.WINTER;

        for(Season season : Season.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }

//        switch(winter){
//            case WINTER:
//                break;
//            case SUMMER:
//                break;
//            case SPRING:
//                break;
//            case FALL:
//                break;
//        }
    }
}
