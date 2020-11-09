package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Runnable {
    private static final int MILESTONES = 5;

    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "Tortoise");
    }

    public Thread getTortoise() {
        return tortoise;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < MILESTONES; i++) {
            switch(i) {
                case 0:
                    System.out.println(" The tortoise has started from the start line ");
                    break;
                case 1:
                    System.out.println(" The tortoise has reached the Cool River! ");
                    break;
                case 2:
                    System.out.println(" The tortoise has reached the Big Oak Tree! ");
                    break;
                case 3:
                    System.out.println(" The tortoise has reached the Mountain Hill ");
                    break;
                case 4:
                    System.out.println(" The tortoise has reached the finish line ");
                    break;
            }
                try {
                    Thread.sleep(
                            3000L
                    );
                } catch (InterruptedException e) {
                    System.out.println(" The tortoise has lost the path ");
                }
           }
        JOptionPane.showConfirmDialog(
                null,
                " The tortoise has completed the race ",
                " Tortoise ",
                JOptionPane.OK_CANCEL_OPTION
        );
       }
   }
