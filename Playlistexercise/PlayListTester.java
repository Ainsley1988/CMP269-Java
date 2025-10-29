package Playlistexercise;
public class PlayListTester {


    public static void main(String[] args) {
        
        Playlist  list = new Playlist();


        Song song1 = new Song("Gasolina", "Daddy Yankee",2020,3.5);
        Song song2 = new Song("Empire State of mine", "Jay Z",2025,4.5);
        Song song3 = new Song("Many men", "50 cent",2005,2.5);




        list.add(song1);
        list.add(song2);
        list.add(song3);



        System.out.println("The number of songs in the playlist "+ list.size());



        System.out.println("The song at "+ list.get(1).toString());

        


    }


    
    
}
