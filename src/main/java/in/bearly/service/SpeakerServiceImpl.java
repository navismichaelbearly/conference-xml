package in.bearly.service;

import in.bearly.model.Speaker;
import in.bearly.repository.HibernateSpeakerRepositoryImpl;
import in.bearly.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
