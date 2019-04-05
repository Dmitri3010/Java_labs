function Fill_JSON(req){
      var  xx = eval('('+req.responseText+')');
      var rc = "";
       for (var i = 0; i < xx.X.length; i++){
         rc += (xx.X[i].rand +" ");
       }
       return (rc);
   };
   function OnClick_JSON(n, s){
	   var req = crReq();
        var patern = new RegExp(/^[1-9]+[0-9]*$/); 
        if (patern.test(n.value)){
        if (req){
          req.open("POST","Sss_JSON", true);
          req.onreadystatechange = function(){
                                     if (req.readyState == 4){
                                        if (req.status == 200){
                                            s.firstChild.data = Fill_JSON(req);
                                            s.className ="h1";
                                        }else {alert("status = "+
                                         req.status +"\n"+req.statusText);
                                        alert("TutaJSON");}
                                      };
                                   };             
           req.setRequestHeader("XRand-N",  n.value);
           req.send("null");
       };
      }else alert ("error");
   };
	    
