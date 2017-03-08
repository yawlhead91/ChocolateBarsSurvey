<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
      <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js"></script>
      <title>Assignment2 Index</title>
      <style>
         body,
         html,
         .valign-wrapper {
         height: 100% !important;
         }
         .valign{
         margin: 0 !important;
         padding: 0 !important;
         }
         .row {
         width: 100%;
         }
         p {
         padding: 10px 0 15px 0;
         }
         .btn{
         	float: right;
         	margin: 15px 35px 0 0;
         }
      </style>
   </head>
   <body class="deep-purple lighten-1">
      <div class="valign-wrapper">
         <div class="row valign">
            <div class="col s8 offset-s2">
               <div class="card">
                  <div class="card-content grey-text">
                     <span class="card-title center-align">Market Survey</span>
                     <p class="center-align">Please choose two of your favorite bars in order of preference</p>
                     <div class="row">
                        <form action="/assignment2/handler" method="POST">
                           <div class="col s6">
                              <p class="center-align deep-purple-text text-darken-3"><b>First Choice</b></p>
                              <p>
                                 <input name="group1" type="radio" id="dchn" value="dchn" />
                                 <label for="dchn">Dark chocolate with hazelnut and nougat</label>
                              </p>
                              <p>
                                 <input name="group1" type="radio" id="wcrc" value="wcrc"/>
                                 <label for="wcrc">White chocolate with raspberry and caramel</label>
                              </p>
                              <p>
                                 <input name="group1" type="radio" id="mccp"  value="mccp"/>
                                 <label for="mccp">Milk chocolate with caramel and peanut</label>
                              </p>
                              <p>
                                 <input name="group1" type="radio" id="dcno" value="dcno"/>
                                 <label for="dcno">Dark chocolate with nougat and orange</label>
                              </p>
                              <p>
                                 <input name="group1" type="radio" id="wcoh" value="wcoh"/>
                                 <label for="wcoh">White chocolate with orange and hazelnut</label>
                              </p>
                              <p>
                                 <input name="group1" type="radio" id="mcpr" value="mcpr"/>
                                 <label for="mcpr">Milk chocolate with peanut and raspberry</label>
                              </p>
                           </div>
                           <div class="col s6">
                              <p class="center-align deep-purple-text text-darken-3"><b>Second Choice</b></p>
                              <p>
                                 <input name="group2" type="radio" id="dchn2" value="dchn"/>
                                 <label for="dchn2">Dark chocolate with hazelnut and nougat</label>
                              </p>
                              <p>
                                 <input name="group2" type="radio" id="wcrc2" value="wcrc"/>
                                 <label for="wcrc2">White chocolate with raspberry and caramel</label>
                              </p>
                              <p>
                                 <input name="group2" type="radio" id="mccp2"  value="mccp"/>
                                 <label for="mccp2">Milk chocolate with caramel and peanut</label>
                              </p>
                              <p>
                                 <input name="group2" type="radio" id="dcno2" value="dcno"/>
                                 <label for="dcno2">Dark chocolate with nougat and orange</label>
                              </p>
                              <p>
                                 <input name="group2" type="radio" id="wcoh2" value="wcoh"/>
                                 <label for="wcoh2">White chocolate with orange and hazelnut</label>
                              </p>
                              <p>
                                 <input name="group2" type="radio" id="mcpr2" value="mcpr"/>
                                 <label for="mcpr2">Milk chocolate with peanut and raspberry</label>
                              </p>
                           </div>
                           <button class="waves-effect waves-light btn" type="submit" value="Submit">Submit</button>
                        </form>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>