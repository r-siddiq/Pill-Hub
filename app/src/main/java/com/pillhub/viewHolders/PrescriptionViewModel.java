package com.pillhub.viewHolders;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.pillhub.Database.PharmacyRepository;
import com.pillhub.Database.entities.Prescription;

import java.util.List;

public class PrescriptionViewModel extends AndroidViewModel {

    private final PharmacyRepository repository;

    public PrescriptionViewModel(Application application){
        super(application);
        repository = PharmacyRepository.getRepository(application);
    }

    public LiveData<List<Prescription>> getAllLogsByUsername(String username) {
        return repository.getAllLogsByUserIdLiveData(username);
    }

    public void insert(Prescription log){
        repository.insertPrescription(log);
    }
}
