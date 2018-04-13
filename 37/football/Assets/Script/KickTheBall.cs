using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class KickTheBall : MonoBehaviour {

    public Transform ball;
    public float speed = 30;

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        float dist = Vector3.Distance(ball.position, transform.position);
        if (dist < 2 && Input.GetKeyDown(KeyCode.Mouse0)) {
            Rigidbody rb = ball.GetComponent<Rigidbody>();
            rb.velocity = transform.forward*speed;
        }
        if(dist < 1) {
            Rigidbody rb = ball.GetComponent<Rigidbody>();
            rb.velocity = transform.forward * speed*0.2f;
        }
    }
}
