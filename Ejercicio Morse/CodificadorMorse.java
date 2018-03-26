import java.util.Scanner;

public class CodificadorMorse {

	public static void main(String[] args) {
	    boolean continuar=true;
		do{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba un mensaje en : \n");
		String mensaje = entrada.nextLine();
		if(mensaje.matches(".*[a-zA-Z0-9].*"))
			System.out.println(cambiarTexto(mensaje));
		else
			System.out.println(cambiarMorse(mensaje));
		
		System.out.println("¿Quiere Intentar de nuevo? responder con (si o no) \n");
		String respuesta = entrada.nextLine();
		if(respuesta.equalsIgnoreCase("no"))
			continuar=false;
		}while(continuar);
	}

	public static String cambiarTexto(String mensaje){
		String cadena = mensaje;
		String textofinal="";
		for(int i=0;i<cadena.length();i++){
			String letra=cadena.substring(i,i+1);

			if(letra.equalsIgnoreCase("a")){
				textofinal+=".- ";
			}else{
				if(letra.equalsIgnoreCase("b")){
					textofinal+="-... ";
				}else{
					if(letra.equalsIgnoreCase("c")){
						textofinal+="-.-. ";
					}else{
						if(letra.equalsIgnoreCase("d")){
							textofinal+="-.. ";
						}else{
							if(letra.equalsIgnoreCase("e")){
								textofinal+=". ";
							}else{
								if(letra.equalsIgnoreCase("f")){
									textofinal+="..-. ";
								}else{
									if(letra.equalsIgnoreCase("g")){
										textofinal+="--. ";
									}else{
										if(letra.equalsIgnoreCase("h")){
											textofinal+=".... ";
										}else{
											if(letra.equalsIgnoreCase("i")){
												textofinal+=".. ";
											}else{
												if(letra.equalsIgnoreCase("j")){
													textofinal+=".--- ";
												}else{
													if(letra.equalsIgnoreCase("k")){
														textofinal+="-.- ";
													}else{
														if(letra.equalsIgnoreCase("l")){
															textofinal+=".-.. ";
														}else{
															if(letra.equalsIgnoreCase("m")){
																textofinal+="-- ";
															}else{
																if(letra.equalsIgnoreCase("n")){
																	textofinal+="-. ";
																}else{
																	if(letra.equalsIgnoreCase("o")){
																		textofinal+="--- ";
																	}else{
																		if(letra.equalsIgnoreCase("p")){
																			textofinal+=".--. ";
																		}else{
																			if(letra.equalsIgnoreCase("q")){
																				textofinal+="--.- ";
																			}else{
																				if(letra.equalsIgnoreCase("r")){
																					textofinal+=".-. ";
																				}else{
																					if(letra.equalsIgnoreCase("s")){
																						textofinal+="... ";
																					}else{
																						if(letra.equalsIgnoreCase("t")){
																							textofinal+="- ";
																						}else{
																							if(letra.equalsIgnoreCase("u")){
																								textofinal+="..- ";
																							}else{
																								if(letra.equalsIgnoreCase("v")){
																									textofinal+="...- ";
																								}else{
																									if(letra.equalsIgnoreCase("w")){
																										textofinal+=".-- ";
																									}else{
																										if(letra.equalsIgnoreCase("x")){
																											textofinal+="-..- ";
																										}else{
																											if(letra.equalsIgnoreCase("y")){
																												textofinal+="-.-- ";
																											}else{
																												if(letra.equalsIgnoreCase("z")){
																													textofinal+="--.. ";
																												}else{
																													if(letra.equalsIgnoreCase("1")){
																														textofinal+=".---- ";
																													}else{
																														if(letra.equalsIgnoreCase("2")){
																															textofinal+="..--- ";
																														}else{
																															if(letra.equalsIgnoreCase("3")){
																																textofinal+="...-- ";
																															}else{
																																if(letra.equalsIgnoreCase("4")){
																																	textofinal+="....- ";
																																}else{
																																	if(letra.equalsIgnoreCase("5")){
																																		textofinal+="..... ";
																																	}else{
																																		if(letra.equalsIgnoreCase("6")){
																																			textofinal+="-.... ";
																																		}else{
																																			if(letra.equalsIgnoreCase("7")){
																																				textofinal+="--... ";
																																			}else{
																																				if(letra.equalsIgnoreCase("8")){
																																					textofinal+="---.. ";
																																				}else{
																																					if(letra.equalsIgnoreCase("9")){
																																						textofinal+="----. ";
																																					}else{
																																						if(letra.equalsIgnoreCase("0")){
																																							textofinal+="----- ";
																																						}else{
																																							if(letra.equalsIgnoreCase(" ")){
																																								textofinal+="  ";
																																							}else{
																																								return "caracter no valido: "+letra;
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return textofinal;
	}
	
	public static String cambiarMorse(String mensaje){
		String cadena = mensaje+" ";
		String textofinal="";
		for(int i=0;i<cadena.length();i++){
			int puntero=cadena.indexOf(" ",i);
			String letra=cadena.substring(i,puntero+1);

			if(letra.equalsIgnoreCase(".- ")){
				textofinal+="a";
			}else{
				if(letra.equalsIgnoreCase("-... ")){
					textofinal+="b";
				}else{
					if(letra.equalsIgnoreCase("-.-. ")){
						textofinal+="c";
					}else{
						if(letra.equalsIgnoreCase("-.. ")){
							textofinal+="d";
						}else{
							if(letra.equalsIgnoreCase(". ")){
								textofinal+="e";
							}else{
								if(letra.equalsIgnoreCase("..-. ")){
									textofinal+="f";
								}else{
									if(letra.equalsIgnoreCase("--. ")){
										textofinal+="g";
									}else{
										if(letra.equalsIgnoreCase(".... ")){
											textofinal+="h";
										}else{
											if(letra.equalsIgnoreCase(".. ")){
												textofinal+="i";
											}else{
												if(letra.equalsIgnoreCase(".--- ")){
													textofinal+="j";
												}else{
													if(letra.equalsIgnoreCase("-.- ")){
														textofinal+="k";
													}else{
														if(letra.equalsIgnoreCase(".-.. ")){
															textofinal+="l";
														}else{
															if(letra.equalsIgnoreCase("-- ")){
																textofinal+="m";
															}else{
																if(letra.equalsIgnoreCase("-. ")){
																	textofinal+="n";
																}else{
																	if(letra.equalsIgnoreCase("--- ")){
																		textofinal+="o";
																	}else{
																		if(letra.equalsIgnoreCase(".--. ")){
																			textofinal+="p";
																		}else{
																			if(letra.equalsIgnoreCase("--.- ")){
																				textofinal+="q";
																			}else{
																				if(letra.equalsIgnoreCase(".-. ")){
																					textofinal+="r";
																				}else{
																					if(letra.equalsIgnoreCase("... ")){
																						textofinal+="s";
																					}else{
																						if(letra.equalsIgnoreCase("- ")){
																							textofinal+="t";
																						}else{
																							if(letra.equalsIgnoreCase("..- ")){
																								textofinal+="u";
																							}else{
																								if(letra.equalsIgnoreCase("...- ")){
																									textofinal+="v";
																								}else{
																									if(letra.equalsIgnoreCase(".-- ")){
																										textofinal+="w";
																									}else{
																										if(letra.equalsIgnoreCase("-..- ")){
																											textofinal+="x";
																										}else{
																											if(letra.equalsIgnoreCase("-.-- ")){
																												textofinal+="y";
																											}else{
																												if(letra.equalsIgnoreCase("--.. ")){
																													textofinal+="z";
																												}else{
																													if(letra.equalsIgnoreCase(".---- ")){
																														textofinal+="1";
																													}else{
																														if(letra.equalsIgnoreCase("..--- ")){
																															textofinal+="2";
																														}else{
																															if(letra.equalsIgnoreCase("...-- ")){
																																textofinal+="3";
																															}else{
																																if(letra.equalsIgnoreCase("....- ")){
																																	textofinal+="4";
																																}else{
																																	if(letra.equalsIgnoreCase("..... ")){
																																		textofinal+="5";
																																	}else{
																																		if(letra.equalsIgnoreCase("-.... ")){
																																			textofinal+="6";
																																		}else{
																																			if(letra.equalsIgnoreCase("--... ")){
																																				textofinal+="7";
																																			}else{
																																				if(letra.equalsIgnoreCase("---.. ")){
																																					textofinal+="8";
																																				}else{
																																					if(letra.equalsIgnoreCase("----. ")){
																																						textofinal+="9";
																																					}else{
																																						if(letra.equalsIgnoreCase("----- ")){
																																							textofinal+="0";
																																						}else{
																																							if(letra.equalsIgnoreCase(" ")){
																																								if(puntero+1!=cadena.length()){
																																									if(cadena.substring(puntero, puntero+2).equalsIgnoreCase("  ")){
																																									textofinal+=" ";
																																									puntero=puntero+1;
																																								}else{
																																									textofinal+=" ";
																																								}
																																								}
																																							}else{
																																								return "caracter no valido: "+letra;
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			i=puntero;
		}
		return textofinal;
	}
}