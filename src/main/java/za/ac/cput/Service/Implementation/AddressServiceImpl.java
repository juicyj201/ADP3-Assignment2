package za.ac.cput.Service.Implementation;

import org.springframework.stereotype.Service;
import za.ac.cput.Service.Interface.AddressService;

import java.lang.annotation.Annotation;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
