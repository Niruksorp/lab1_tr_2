package ru.sfu;

import ru.sfu.DFAFacade.DFAFacade;
import ru.sfu.DFAFacade.DFAFacadeImpl;
import ru.sfu.Entity.DFAData;
import ru.sfu.Entity.DFAStates;
import ru.sfu.Logic.InputService;

public class Application {

    public static void main(String[] args) {
        final DFAFacade dfaFacade = new DFAFacadeImpl();
        DFAData dfaData = dfaFacade.generateDFAData();
        InputService inputService = new InputService();
        String s = inputService.getUserString();
        char[] chars = s.toCharArray();
        if (inputService.validateUserInput(s,dfaData.getAlphabet())) {
            DFAStates[][] dfaTable = dfaData.getTransitionTable();
            int temp;
            for (int i = 0; i < s.length(); i++) {
                if (chars[i] == 97) temp = 0;
                else temp = 1;
                DFAStates rez = dfaTable[dfaData.getStartStateInit().getState()][temp];
                dfaData.setStartStateInit(rez);
            }
            Boolean some = false;
            for (int i = 0; i < dfaData.getAcceptedStatesInit().size(); ++i) {
                some = dfaData.getAcceptedStatesInit().stream().anyMatch(state -> state == dfaData.getStartStateInit());
            }
            if (some) {
                System.out.println("Корректно");
            } else {
                System.out.println("Не корректно");
            }
        } else System.out.println("Неправильный ввод");
    }
}
