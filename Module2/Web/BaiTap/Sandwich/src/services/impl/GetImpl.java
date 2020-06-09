package services.impl;

import org.springframework.stereotype.Service;
import services.Get;

import java.util.Arrays;

@Service
public class GetImpl implements Get {
    @Override
    public String returnString(String[] ele) {
        return Arrays.toString(ele);
    }
}
