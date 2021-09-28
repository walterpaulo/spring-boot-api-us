package br.com.uSolution.springbootapius.resources.execption;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.uSolution.springbootapius.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExeceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<ErroPadrao> resourceNotFound(ObjectNotFoundException e, HttpServletRequest resquest) {

		String erro = "objct not found";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		ErroPadrao err = new ErroPadrao(Instant.now(), status.value(), erro, e.getMessage(), resquest.getRequestURI());

		return ResponseEntity.status(status).body(err);
	}

	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<ErroPadrao> numberFormatException(NumberFormatException e, HttpServletRequest resquest) {

		String erro = "Invalid data";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		ErroPadrao err = new ErroPadrao(Instant.now(), status.value(), erro, e.getMessage(), resquest.getRequestURI());

		return ResponseEntity.status(status).body(err);
	}

}
