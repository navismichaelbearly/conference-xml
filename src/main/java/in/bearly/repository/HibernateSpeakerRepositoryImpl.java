package in.bearly.repository;

import in.bearly.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Blissie");
        speaker.setLastName("Fidelia");

        speakers.add(speaker);

        return speakers;
    }
}
