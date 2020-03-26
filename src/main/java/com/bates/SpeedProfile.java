package com.bates;

public class SpeedProfile {
    private final String unitOfMeasure;
    private final Integer vRotate;
    private final Integer vX;
    private final Integer vY;
    private final Integer vPattern;
    private final Integer vBase;
    private final Integer vFinal;
    private final Integer vSo;
    private final Integer vSi;

    public SpeedProfile(
            String unitOfMeasure,
            Integer vRotate,
            Integer vX,
            Integer vY,
            Integer vPattern,
            Integer vBase,
            Integer vFinal,
            Integer vSo,
            Integer vSi
    ) {
        this.unitOfMeasure = unitOfMeasure;
        this.vRotate = vRotate;
        this.vX = vX;
        this.vY = vY;
        this.vPattern = vPattern;
        this.vBase = vBase;
        this.vFinal = vFinal;
        this.vSo = vSo;
        this.vSi = vSi;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public Integer getvRotate() {
        return vRotate;
    }

    public Integer getvX() {
        return vX;
    }

    public Integer getvY() {
        return vY;
    }

    public Integer getvPattern() {
        return vPattern;
    }

    public Integer getvBase() {
        return vBase;
    }

    public Integer getvFinal() {
        return vFinal;
    }

    public Integer getvSo() {
        return vSo;
    }

    public Integer getvSi() {
        return vSi;
    }

}
