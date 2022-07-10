package some_cool_media_library;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video.VideoBuilder("dsf").withTitle("dsjjdijf").withData("dsfds").build());
        hmap.put("mkafksangasj",  new Video.VideoBuilder("fdgdfg").withTitle("ncud8876").withData("o9988").build());
        hmap.put("dancesvideoo", new Video.VideoBuilder("a232").withTitle("dsjjdijf").withData("dsfds").build());
        hmap.put("dlsdk5jfslaf", new Video.VideoBuilder("fdfd434").withTitle("6543").withData("dsfdsr4423").build());
        hmap.put("3sdfgsd1j333", new Video.VideoBuilder("fdbdfb").withTitle("dregregu89").withData("89r0w").build());

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video.VideoBuilder(videoId).withTitle("dsjjdijf").withData("dsfds").build();

        System.out.print("Done!" + "\n");
        return video;
    }

}
