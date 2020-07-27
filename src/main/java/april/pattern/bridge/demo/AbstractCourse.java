package april.pattern.bridge.demo;

import april.pattern.bridge.demo.impl.INote;
import april.pattern.bridge.demo.impl.IVideo;

/**
 * @author yanzx
 */
public abstract class AbstractCourse implements ICourse {
    private INote note;
    private IVideo video;

    @Override
    public String toString() {
        return "AbstractCourse{" +
                "note=" + note +
                ", video=" + video +
                '}';
    }

    public void setNote(INote note) {
        this.note = note;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }
}
