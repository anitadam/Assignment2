package Assignment;
// declared
public class ReadTextLogic {
    private int countRows; // attribute to hold amount of rows
    private int countChar;// attribute  to hold amount of characters
    private int countWords; // attribute to hold amount words

    private String longestWord;
    private boolean isRunning;

// gett objekten startvärden
    public ReadTextLogic() {
        this.countRows = 0;
        this.countChar = 0;
        this.countWords = 0;
        this.longestWord = "";
        this.isRunning = true;

    }

// countlines metod sköter beräkning
    public void countLines(String input) /* method that  increases number of rows, calculates number of characters
             and amount of words*/ {



        countRows++; // increase rows each time text is entered
        countChar += input.length(); // värdet av countchar läggs till input,lengtch

        String[] words = input.split("\\s+");
        // create an array word. split separates the text string and counts words
        countWords += words.length; // updates the value of countWords to the array in words. Length keeps
        // track of number of words in words.
// loops through array words, checks if eachword is longer than longestword
        // updates longestword to eachword, checks eachword again to see if its logger, and updates to each word if longer
        for (String eachWord : words) {

            if (eachWord.length() > longestWord.length()) {
                longestWord = eachWord;
            }

        }


    }

    public boolean isRunning(String input) {

        if (input.equals("stop")) {

            isRunning = false;

        }
        return isRunning;

    }


    public String getLongestWord() {
        return longestWord;
    }


    public int getCountRows() {


        return countRows;

    }


    public int getCountChar() {

        return countChar;

    }

    public int getCountWords() {
        return countWords;
    }

}
