import java.util.Scanner;

class Media {
    protected String title;
    public Media(String title) { this.title = title; }
    public void process() { System.out.println("Starting generic media processing."); }
}

class Video extends Media {
    protected int duration;
    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }
    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;
    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }
    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}

public class lab56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        Video video;
        
        if (isNumeric(input1)) {
            int duration = Integer.parseInt(input1);
            String defaultTitle = (duration == 60) ? "Tutorial" : "Lecture 3";
            video = new Video(defaultTitle, duration);
        } else {
            String vTitle = input1;
            int vDuration = Integer.parseInt(sc.nextLine());
            video = new Video(vTitle, vDuration);
        }

        String aTitle = sc.nextLine();
        String aQuality = sc.nextLine();
        Audio audio = new Audio(aTitle, aQuality);

        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        sc.close();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}