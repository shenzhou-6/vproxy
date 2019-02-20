package net.cassite.vproxyx.websocks5;

import net.cassite.vproxy.connection.Connector;
import net.cassite.vproxy.http.HttpContext;
import net.cassite.vproxy.protocol.ProtocolHandlerContext;
import net.cassite.vproxy.socks.Socks5ProxyContext;
import net.cassite.vproxy.util.ByteArrayChannel;
import net.cassite.vproxy.util.Callback;
import net.cassite.vproxy.util.Tuple;

import java.io.IOException;

public class WebSocks5ProxyContext {
    int step = 0;

    final ProtocolHandlerContext<HttpContext> httpContext;
    ByteArrayChannel webSocketBytes;
    final ProtocolHandlerContext<Tuple<Socks5ProxyContext, Callback<Connector, IOException>>> socks5Context;

    public WebSocks5ProxyContext(ProtocolHandlerContext<HttpContext> httpContext,
                                 ProtocolHandlerContext<Tuple<Socks5ProxyContext, Callback<Connector, IOException>>> socks5Context) {
        this.httpContext = httpContext;
        this.socks5Context = socks5Context;
    }
}
