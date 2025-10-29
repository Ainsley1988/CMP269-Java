package Playlistexercise;
public class Playlist {

/* 
 * firstSong box wull be used to  keep the address to the first box  that contains the first song in the playlist
 * 
 * 
 * lastsongbox eill be used to keep an address to the las box that contains the last song  in the playlist
 * 
 *  the vraible count will be used to kepp track of the amount of songs  in the playlist
*/



    private SongBox firstSongBox;
    private SongBox lastSongBox;

    private int count;

    public Playlist(){

        firstSongBox = null;
        lastSongBox = null;
        count = 0; 
    }


    public int size(){


        return count;
    }

    public boolean isEmpty(){


        return (count == 0);
    }
/*

the following  methos will be used to add new song to the playlist

remember a song has to be placed into a song box to be add to the play list 

*/ 
    public void add(Song song) throws NullPointerException{


        if (song == null){

            throw new NullPointerException("Song can not be null");
        }
        /*
         * Songs  in the playlist mus be placed inside a songbox for each song parameter passed
         * for each song pased as parameter , we have to create a songBox for it 
         * 
        */

        SongBox newSongBox = new SongBox(song);

         if(this.isEmpty()){

            this.firstSongBox = newSongBox;
            this.lastSongBox = newSongBox;
            this.count++;

         } else {

            /* when the list is not empty we want to add the new  box of our son to the end of the playlist



            remember that we already have an instance variable that keeos track of the last song box in the playlist
             * 
             * 
             * 
            */

            
            this.lastSongBox.setNext(newSongBox);
            // last song baox has changed so we need to set the last song to the new song 

            this.lastSongBox = newSongBox;
            this.count++;
         }
        





    }
public void add(Song newSong, int index) throws IndexOutOfBoundsException{

    if(index > 0 || index > count){

        throw new IndexOutOfBoundsException("Index is out of bound");
    }
    if(newSong == null){

        throw new NullPointerException("Song cannnot be null");
    }

    if(index == 0){
        SongBox newSongBox = new SongBox(newSong);

        newSongBox.setNext(this.firstSongBox);

        this.firstSongBox =  newSongBox;
        count++;


        // The new song is being placed at the front

    } else if(index == count){
// new son should be in the back

// call the add song method 
     this.add(newSong);


    } else{


            int currentIndex = 0;
            SongBox previousSongBox = null;
            SongBox currentSongBox = this.firstSongBox;
            SongBox newSongBox = new SongBox(newSong);


            while(currentIndex != index){
                previousSongBox = currentSongBox;
                currentSongBox = currentSongBox.getNext();
                currentIndex++;
            }

            previousSongBox.setNext(newSongBox);
            newSongBox.setNext(currentSongBox);



        //insert the new song at the specified index
    }


}

    public Song get(int index){

        //  We may  need to take care of invalided indexes

        if(index < 0 || index > this.count ){


            return null;


        }

if(this.isEmpty()){


    return null;
} else {

int currentIndex = 0;

SongBox currentSongBox = this.firstSongBox;

while(currentIndex != index){
currentSongBox = currentSongBox.getNext();
currentIndex++;

}

return currentSongBox.getSong();

}

    }


    public Song replace(Song song, int index) throws IndexOutOfBoundsException { 

        
        if(song == null){

            return null;
        }

        if(index < 0 || index > this.count){

            throw new IndexOutOfBoundsException("Index is not in range");


        }
        Song replacedSong = null;

        if(index == 0){
//this  measn we are replacing the first song
        // save the current sonf that is in the first song box 
        replacedSong = this.firstSongBox.getSong();
        // replace the song that is in the first song box
         this.firstSongBox.setSong(song);

        } else if(index == (count-1)){ 

            replacedSong = this.lastSongBox.getSong();


            this.lastSongBox.setSong(song);

            //replacing the last song


        } else{
// replacing the song at a certain index

int currentIndex = 0 ;

SongBox currentSongBox = this.firstSongBox;

while(currentIndex != index){


currentSongBox = currentSongBox.getNext();
currentIndex++;

}
        

}



        return replacedSong;





    }


    /*
     * The following method us used to remove a song at the specified index and return at a specified index
     * 
     * 
     * if the index is not cvalid the method should return indexOutofBoundsException
     * 
     * 
    */

    public Song remove(int index) throws IndexOutOfBoundsException{


        if(index < 0 || index > 0){

            throw new IndexOutOfBoundsException("");


        }
        Song removedSong = null;


        if(count == 1 ){
removedSong = this.get(0);

removeAll();

        } else {
            
            int currentIndex = 0;
            SongBox previousSongBox = null;
            SongBox currentSongBox = this.firstSongBox;


            while(currentIndex != index){
                previousSongBox = currentSongBox;
                currentSongBox = currentSongBox.getNext();
                currentIndex++;
            }
            
            
            if(index == 0){


                removedSong =this.firstSongBox.getSong();
            SongBox newFirst = this.firstSongBox.getNext();

            this.firstSongBox.setNext(null);

            this.firstSongBox = newFirst;
            this.count--;

            }else
            
            
            if(index == count - 1){
            // this measn we remove the last song
            //count is suppsoed to decrease by 1

         //update the last songbox to be the previous songbox

         removedSong =this.lastSongBox.getSong();
         this.lastSongBox = previousSongBox;
         this.lastSongBox.setNext(null);
         this.count--;


        } else{

            removedSong = currentSongBox.getSong();

            previousSongBox.setNext(currentSongBox.getNext());
            count--;



        }
    }




        return removedSong;



    }


    public void removeAll(){

        this.firstSongBox = null;

        this.lastSongBox = null;
        this.count = 0;
    }





    
}
