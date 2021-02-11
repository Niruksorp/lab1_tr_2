package ru.sfu.Init;

import ru.sfu.Entity.DFAStates;
import ru.sfu.Entity.EnumAlphabet;
import ru.sfu.Init.InitService;

import java.util.List;

public class InitServiceImpl implements InitService {
    @Override
    public DFAStates[][] initStateTable() {
        DFAStates[][] transitionTable = new DFAStates[9][2];
        transitionTable[DFAStates.q0.getState()][EnumAlphabet.a.getState()] = DFAStates.q1;
        transitionTable[DFAStates.q0.getState()][EnumAlphabet.b.getState()] = DFAStates.q2;

        transitionTable[DFAStates.q1.getState()][EnumAlphabet.a.getState()] = DFAStates.q3;
        transitionTable[DFAStates.q1.getState()][EnumAlphabet.b.getState()] = DFAStates.q7;

        transitionTable[DFAStates.q2.getState()][EnumAlphabet.a.getState()] = DFAStates.q7;
        transitionTable[DFAStates.q2.getState()][EnumAlphabet.b.getState()] = DFAStates.q5;

        transitionTable[DFAStates.q3.getState()][EnumAlphabet.a.getState()] = DFAStates.q0;
        transitionTable[DFAStates.q3.getState()][EnumAlphabet.b.getState()] = DFAStates.q6;

        transitionTable[DFAStates.q4.getState()][EnumAlphabet.a.getState()] = DFAStates.q5;
        transitionTable[DFAStates.q4.getState()][EnumAlphabet.b.getState()] = DFAStates.q3;

        transitionTable[DFAStates.q5.getState()][EnumAlphabet.a.getState()] = DFAStates.q8;
        transitionTable[DFAStates.q5.getState()][EnumAlphabet.b.getState()] = DFAStates.q0;

        transitionTable[DFAStates.q6.getState()][EnumAlphabet.a.getState()] = DFAStates.q2;
        transitionTable[DFAStates.q6.getState()][EnumAlphabet.b.getState()] = DFAStates.q0;

        transitionTable[DFAStates.q7.getState()][EnumAlphabet.a.getState()] = DFAStates.q6;
        transitionTable[DFAStates.q7.getState()][EnumAlphabet.b.getState()] = DFAStates.q8;

        transitionTable[DFAStates.q8.getState()][EnumAlphabet.a.getState()] = DFAStates.q4;
        transitionTable[DFAStates.q8.getState()][EnumAlphabet.b.getState()] = DFAStates.q1;
        return transitionTable;
    }

    @Override
    public List<DFAStates> acceptedStatesInit() {
        return List.of(
                DFAStates.q1,
                DFAStates.q3,
                DFAStates.q6);
    }

    @Override
    public char[] alphabetInit() {
        return new char[]{'a', 'b'};
    }

    @Override
    public DFAStates startStateInit() {
        return DFAStates.q0;
    }
}
