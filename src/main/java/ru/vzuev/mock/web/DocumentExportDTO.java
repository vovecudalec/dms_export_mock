package ru.vzuev.mock.web;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "documentExportDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentExportDTO {
    public String targetSystem;
    @XmlElementWrapper(name = "attributes")
    @XmlElements(value = {@XmlElement(name = "entry")})
    public List<Entry> attributes = new ArrayList<>();


    public DocumentExportDTO() {
    }

    public String getTargetSystem() {
        return targetSystem;
    }

    public void setTargetSystem(String targetSystem) {
        this.targetSystem = targetSystem;
    }

    public List<Entry> getAttributes() {
        return attributes;
    }

    public void setAttributes(Entry[] arr) {
        for (Entry entry : arr) {
            this.attributes.add(entry);
        }
    }

    public void addAttribute(String key, String value) {
        Entry entry = new Entry();
        entry.key = key;
        entry.value = value;
        this.attributes.add(entry);
    }

    private static class Entry {
        public String key;
        public String value;

        @Override
        public String toString() {
            return "Entry{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DocumentExportDTO{" +
                "targetSystem='" + targetSystem + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
