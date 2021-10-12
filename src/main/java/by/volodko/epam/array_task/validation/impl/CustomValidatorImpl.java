package by.volodko.epam.array_task.validation.impl;

import by.volodko.epam.array_task.validation.CustomValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomValidatorImpl implements CustomValidator {


    @Override
public boolean isValid(String contentFromFile) {
                Pattern pattern = Pattern.compile(STRING_TO_DOUBLE_REGEXP);
                Matcher matcher = pattern.matcher(contentFromFile);
                return matcher.matches();
            }
        }


