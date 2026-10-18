package com.devricardorocha.selfservice.api.msuser.contexts;

import lombok.Getter;

@Getter
public class LegalWorkAgeContext {

    private static final int DEFAULT_LOCAL_LEGAL_WORK_AGE = 18;
    private int legalWorkAge = DEFAULT_LOCAL_LEGAL_WORK_AGE;

    private LegalWorkAgeContext() {}

    private static class SingletonHolder {
        private static final LegalWorkAgeContext INSTANCE = new LegalWorkAgeContext();
    }

    public static LegalWorkAgeContext getInstance() {
        return SingletonHolder.INSTANCE;
    }

    void setLegalWorkAge(int legalWorkAge) {
        this.legalWorkAge = legalWorkAge;
    }
}
