package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("female")
public class Female extends User{
    private static final long serialVersionUID = 64196486965221074L;
    private List<FemaleExamination> examinations ;

    public List<FemaleExamination> getExaminations() {
        return examinations;
    }

    public void setExaminations(List<FemaleExamination> examinations) {
        this.examinations = examinations;
    }
}
