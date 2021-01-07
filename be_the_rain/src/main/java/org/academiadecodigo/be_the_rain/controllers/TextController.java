package org.academiadecodigo.be_the_rain.controllers;

import org.academiadecodigo.be_the_rain.Dto.*;
import org.academiadecodigo.be_the_rain.converters.*;
import org.academiadecodigo.be_the_rain.models.*;
import org.academiadecodigo.be_the_rain.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/text")

public class TextController  {

    private AntiMaskService antiMaskService;
    private AntiVaxService antiVaxService;
    private DiscriminService discriminService;
    private FeaService feaService;
    private InstituService instituService;
    private PeerRevService peerRevService;
    private PollutService pollutService;
    private SocialImpService socialImpService;

    private AntiVaxConverter antiVaxConverter;
    private AntiMaskConverter antiMaskConverter;
    private DiscriminationConverter discriminationConverter;
    private FearConverter fearConverter;
    private InstitutionConverter institutionConverter;
    private PeerReviewedConverter peerReviewedConverter;
    private PollutionConverter pollutionConverter;
    private SocialImpactConverter socialImpactConverter;


    @Autowired
    public void setAntiVaxService(AntiVaxService antiVaxService) {
        this.antiVaxService = antiVaxService;
    }

    @Autowired
    public void setAntiMaskService(AntiMaskService antiMaskService) {
        this.antiMaskService = antiMaskService;
    }
    @Autowired
    public void setDiscriminService(DiscriminService discriminService) {
        this.discriminService = discriminService;
    }
    @Autowired
    public void setFeaService(FeaService feaService) {
        this.feaService = feaService;
    }

    @Autowired
    public void setInstituService(InstituService instituService) {
        this.instituService = instituService;
    }
    @Autowired
    public void setPeerRevService(PeerRevService peerRevService) {
        this.peerRevService = peerRevService;
    }
    @Autowired
    public void setPollutService(PollutService pollutService) {
        this.pollutService = pollutService;
    }

    @Autowired
    public void setSocialImpService(SocialImpService socialImpService) {
        this.socialImpService = socialImpService;
    }
    @Autowired
    public void setAntiVaxConverter(AntiVaxConverter antiVaxConverter) {
        this.antiVaxConverter = antiVaxConverter;
    }

    @Autowired
    public void setAntiMaskConverter(AntiMaskConverter antiMaskConverter) {
        this.antiMaskConverter = antiMaskConverter;
    }
    @Autowired
    public void setDiscriminationConverter(DiscriminationConverter discriminationConverter) {
        this.discriminationConverter = discriminationConverter;
    }
    @Autowired
    public void setFearConverter(FearConverter fearConverter) {
        this.fearConverter = fearConverter;
    }

    @Autowired
    public void setInstitutionConverter(InstitutionConverter institutionConverter) {
        this.institutionConverter = institutionConverter;
    }
    @Autowired
    public void setPollutionConverter(PollutionConverter pollutionConverter) {
        this.pollutionConverter = pollutionConverter;
    }
    @Autowired
    public void setSocialImpactConverter(SocialImpactConverter socialImpactConverter) {
        this.socialImpactConverter = socialImpactConverter;
    }

    @Autowired
    public void setPeerReviewedConverter(PeerReviewedConverter peerReviewedConverter) {
        this.peerReviewedConverter = peerReviewedConverter;
    }



    @RequestMapping(method = RequestMethod.GET, path = "/antiMask/{id}")
    public ResponseEntity<DtoAntiMask> showAntiMask(@PathVariable Integer id){
        System.out.println("HTLLLLLLLOOOOO");
        AntiMask antiMask = antiMaskService.get(id);

        return new ResponseEntity<>(antiMaskConverter.convert(antiMask), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/antiVax/{id}")
    public ResponseEntity<DtoAntiVax> showAntiVax(@PathVariable Integer id){

        AntiVax antiVax = antiVaxService.get(id);

        return new ResponseEntity<>(antiVaxConverter.convert(antiVax), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/discrimination/{id}")
    public ResponseEntity<DtoDiscrimination> showDiscrimination(@PathVariable Integer id){

        Discrimination discrimination = discriminService.get(id);

        return new ResponseEntity<>(discriminationConverter.convert(discrimination), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/fear/{id}")

    public ResponseEntity<DtoFear> showFear(@PathVariable Integer id){

        Fear fear = feaService.get(id);

        return new ResponseEntity<>(fearConverter.convert(fear), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/institution/{id}")
    public ResponseEntity<DtoInstitution> showInstitution(@PathVariable Integer id){

        Institution institution = instituService.get(id);

        return new ResponseEntity<>(institutionConverter.convert(institution), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/peerReviewed/{id}")
    public ResponseEntity<DtoPeerReviewed> showPeer(@PathVariable Integer id){

        PeerReviewed peerReviewed = peerRevService.get(id);

        return new ResponseEntity<>(peerReviewedConverter.convert(peerReviewed), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/pollution/{id}")
    public ResponseEntity<DtoPollution> showPollution(@PathVariable Integer id){

        Pollution pollution = pollutService.get(id);

        return new ResponseEntity<>(pollutionConverter.convert(pollution), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/social/{id}")
    public ResponseEntity<DtoSocialImpact> showSocial(@PathVariable Integer id){

        SocialImpact socialImpact = socialImpService.get(id);

        return new ResponseEntity<>(socialImpactConverter.convert(socialImpact), HttpStatus.OK);
    }



}
