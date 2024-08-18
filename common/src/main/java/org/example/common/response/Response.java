package org.example.common.response;


import lombok.Data;
import org.example.common.utils.TimeTools;
import org.springframework.http.HttpStatus;

@Data
public class Response<T> {
    private int status;
    private String message;
    private T data;
    private String dateTime = TimeTools.getZoneDateTimeNow();

    public Response(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(200, "success", data);
    }

    public static <T> Response<T> success() {
        return new Response<>(200, "success", null);
    }

    public static <T> Response<T> error(int status, String message) {
        return new Response<>(status, message, null);
    }

    public static <T> Response<T> error(String message) {
        return new Response<>(500, message, null);
    }

    public static <T> Response<T> error() {
        return new Response<>(500, "error", null);
    }
}
