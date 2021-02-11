package ru.sfu.Init;

import ru.sfu.Entity.DFAStates;

import java.util.List;

public interface InitService {
    DFAStates[][] initStateTable();
    List<DFAStates> acceptedStatesInit();
    char[] alphabetInit();
    DFAStates startStateInit();
}
