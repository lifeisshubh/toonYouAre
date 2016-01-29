package com.example.model;

import java.util.*;

public class CartoonExpert{

    public static String cartoonGenius(String name,int color,int quote, int motive){
		String[] quoteCollection = {"Darkness can prevent you from black world also","Life is beutiful or Ugly, It's just a perception","The real heros always remain in darkness","We can be hero, or we can die a villan, But the world should Notice Us","Invention is 99% persistance and 1% Innovation"}; 
		String[] motiveCollection = {"Living on your own","Earn Money","Fight from bad people","Making this world a better place"};

		String[] theList = {"tom","jerry","Scooby Doo","Scrapy Doo","Shaggy","Belma","Fred","Dexter","Power Puff Girl","Doremon","Nobita","Suzuka","Sunyo","Courage the curly Dog","Timba","Timon","Pumba","Batman","Superman","Spiderman","Ironman","Noddy","Thomas the Engine","Chotta Bheem","Mighty Raju","Hash Kechem from Pokemon","Broke from Pokemon","Misty from Pokemon","Prof. Oak from Pokemon","Sylvester the Cat","Daffy Duck","Donald Duck","Mickey Mouse","Mini Mouse","Goofy","Cindrella","Ballo","Mogli","Baghera","Herculus","Maleficent","Bugs Bunny","Samurai Jack","Stuart Little","Mojo Jojo","Mike Wazon","Pizza Cat","Top Cat","Pluto","Ritchee Ritch","Buzz LightYear","Arrow","Flash","Woody","Garfield the Cat","Casper the Ghost","Bugs Bunny","Hulk","Wolvrine","Fire","Pika chu","Rai chu","Charlizard","Bulbasour","Checorita","Squirtal","Toga pi","Beizing","Miouth","Jassy form Team Rocket","Jane form Team Rocket","Syther","Sparrow","Homer Simpson","Popye","Tweety Bird","Archie","Linus van Pelt","Lucy van Pelt","Mighty Mouse","Fat Albert"};
     
		String[][][] theBigData = new String[5][4][4];
		int p = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					theBigData[i][j][k] = theList[p];
					p++;
				}
			}
		}
        String char_name = theBigData[color][quote][motive];
        
        String retString = name + ", You are \""+char_name+"\".";
        
        return retString;
	}

}