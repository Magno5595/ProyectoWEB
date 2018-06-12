<%@page contentType="text/html; charset=iso-8859-1" language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html>
<head>
	<script src="fabric.js"></script>
		<style type="text/css">
		#c{
			background: #2ECCFA;
		}

		body{
			background: #2ECCFA;
		}
	</style>
</head>
<body>
	<br>
          <input type="button" value="Copiar carta" onClick="Copy()"  style='width:150px; height:50px'  />
	   <input type="button" value="Pegar carta" onClick="Paste()"  style='width:150px; height:50px'/>
	  <input type="button" value="Guardar" onClick="Guardar()"  style='width:150px; height:50px'/>
          <p id="demo"></p>
          
          <s:iterator value="lista6" var="ele">
          <s:set var="res" value="%{#ele[3]}"></s:set>
             </s:iterator>
	<canvas id="c" width="1700" height="1000"></canvas>
	<script>
		
	     var canvas = new fabric.Canvas('c');
             
             var i=0;
             var o="10";
             var respuestas = [];
         
             i=i+1;
              var nombreExamen = '<s:property value="#ele[0]" />';
              var descripcion = '<s:property value="%{#ele[1]}"/>';
              var oracionPregunta = '<s:property value="%{#ele[2]}"/>';
             respuestas.push('<s:property value="%{#ele[3]}"/>');
         
             var serialization="";
             document.getElementById("demo").value = nombreExamen;

		 var text = new fabric.Text(nombreExamen, { left: 1040, top: 5 });
                 var text2 = new fabric.Text(descripcion, { left: 1040, top: 150 });
                 var text3 = new fabric.Text(oracionPregunta, { left: 1040, top: 300 });
                 var text4 = new fabric.Text(respuestas[0], { left: 1000, top: 5 });
                 var text5 = new fabric.Text(respuestas[1], { left: 800, top: 5 });
                 var text6 = new fabric.Text(respuestas[2], { left: 600, top: 5 });
                 var text7 = new fabric.Text(respuestas[3], { left: 400, top: 5 });
                 var text8 = new fabric.Text(i.toString(), { left: 200, top: 5 });
                 var text9 = new fabric.Text(o, { left: 5 top: 5 });
                 canvas.add(text8);
                  
		 canvas.add(text);
                 canvas.add(text2);
                 canvas.add(text3);
                 canvas.add(text4);
                 canvas.add(text5);
                 canvas.add(text6);
                 canvas.add(text7);
                 canvas.add(text9);
		
             serialization = JSON.stringify(canvas);
            
             function Guardar(){
                 location.href = "guardado.action?cadenaJSON="+serialization;
            }
      
	</script>
</body>
</html>
