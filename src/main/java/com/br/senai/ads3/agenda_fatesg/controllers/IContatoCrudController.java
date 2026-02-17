/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.senai.ads3.agenda_fatesg.controllers;

import com.br.senai.ads3.agenda_fatesg.domains.Contato;

/**
 *
 * @author Clayton
 */
public interface IContatoCrudController extends IContatoSearchController{
    public boolean insert(Contato contato);
    public boolean update(Contato contato);
    public boolean delete(Contato contato);
}
