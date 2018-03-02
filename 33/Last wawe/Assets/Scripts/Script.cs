using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Script : MonoBehaviour
{

    float time = 0;
    int wave = 0;

    // Use this for initialization
    void Start()
    {
    }

    // Update is called once per frame
    void Update()
    {
        time = time + Time.deltaTime;
        if (time > 15)
        {
            wave = wave + 1;
            print("wave " + wave + "  GET READY!!!");
            time = 0;
        }

    }
}

