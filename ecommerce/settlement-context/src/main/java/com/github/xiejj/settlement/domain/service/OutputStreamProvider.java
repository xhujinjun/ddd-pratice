package com.github.xiejj.settlement.domain.service;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
public interface OutputStreamProvider {
    OutputStream getOutputStream() throws IOException;
}
