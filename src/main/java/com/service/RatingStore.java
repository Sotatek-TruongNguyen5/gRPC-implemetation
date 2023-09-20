package com.service;

public interface RatingStore {
    Rating Add(String laptopID, double score);
}
