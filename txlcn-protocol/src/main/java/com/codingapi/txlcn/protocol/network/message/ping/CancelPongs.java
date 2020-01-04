package com.codingapi.txlcn.protocol.network.message.ping;

import com.codingapi.txlcn.protocol.Peer;
import com.codingapi.txlcn.protocol.network.Connection;
import com.codingapi.txlcn.protocol.network.message.Message;

public class CancelPongs implements Message {

    private static final long serialVersionUID = 5147827390577329607L;

    private final String peerName;

    public CancelPongs(String peerName) {
        this.peerName = peerName;
    }

    @Override
    public void handle(Peer peer, Connection connection) {
        peer.cancelPongs(peerName);
    }

    @Override
    public String toString() {
        return "RemovePongs{" +
                "peerName='" + peerName + '\'' +
                '}';
    }

}
