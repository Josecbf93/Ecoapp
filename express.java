importar expreso de "expreso";
importar TeamCtrl desde "./team.controller.js";
importar UserCtrl desde "./user.controller.js";
importar MemberCtrl desde "./member.controller.js";

const enrutador = express.Router();

router.route("/teams").post(TeamCtrl.apiAddTeam).put(TeamCtrl.apiEditTeam).delete(TeamCtrl.apiDeleteTeam);
router.route("/equipos/nuestros-objetivos").put(TeamCtrl.apiCreateGoals);
router.route("/equipo/:código_equipo/:usuario").get(TeamCtrl.apiGetTeamById);
router.route("/usuarios/:puntuación").get(UserCtrl.apiGetRank);
router.route("/usuario/:id_usuario").get(UserCtrl.apiGetUser);
router.route("/users/update-score").put(TeamCtrl.apiUpdateScore);
router.route("/usuarios").put(UserCtrl.apiEditUser);
router.route("/join-team").patch(MemberCtrl.apiAddMember);
router.route("/registro").post(UserCtrl.apiAddUser);

exportar enrutador predeterminado;