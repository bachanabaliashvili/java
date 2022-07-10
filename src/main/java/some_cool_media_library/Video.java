package some_cool_media_library;

public class Video {
    public String id;
    public String title;
    public String data;

    Video(VideoBuilder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.data = "Random video.";
    }
    public static class VideoBuilder
    {
        public String id;
        public String title;
        public String data;

        public VideoBuilder(String id){
            this.id = id;
        }
        public VideoBuilder withTitle(String title){
            this.title = title;
            return this;
        }

        public VideoBuilder withData(String data)
        {
            this.data = data;
            return this;
        }
        public Video build()
        {
            return new Video(this);
        }
    }
}