using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Multyplacation : MonoBehaviour {

	// Use this for initialization
	void Start () {
        int a = 0;
        int b = 7;

        while (true)
        {
            a = a + 1;
            if (a > 9)
            {
                break;
            }
            print(a + "*" + b + "=" + a * b);
        }
    }
	
	// Update is called once per frame
	void Update () {
		
	}
}
