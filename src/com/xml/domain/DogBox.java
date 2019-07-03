package com.xml.domain;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
public class DogBox
{
    private List<Dog> dogList;

    public DogBox()
    {
    }

//    @XmlElementWrapper(name = "lowly-dogList")
    @XmlElement(name = "dog")
    public List<Dog> getDogList()
    {
        return dogList;
    }

    public void setDogList(List<Dog> dogList)
    {
        this.dogList = dogList;
    }
}
