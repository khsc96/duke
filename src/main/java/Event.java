import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task{

    protected final String eventLogo = "E";
    private LocalDate time;
    private DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MMM dd yyyy");

    public Event(String taskName, LocalDate by) {
        super(taskName);
        this.time = by;
    }

    public String getTime() {
        return time.format(outputFormat);
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        String formattedDate = time.format(outputFormat);
        return String.format("[%s]%s (by: %s)", eventLogo, super.toString(), formattedDate);
    }
}
