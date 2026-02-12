/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.senai.ads3.agenda_fatesg.controllers;

import com.br.senai.ads3.agenda_fatesg.domains.Contato;
import java.util.List;

/**
 *
 * @author Clayton
 */
public interface IContatoSearchController {
    public List<Contato> searchAll();
    public boolean exists(Contato contato);
}
